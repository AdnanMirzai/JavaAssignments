package se.kth.adn.scribble.view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Point2D;
import javafx.geometry.Pos;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;

import se.kth.adn.scribble.model.Line;
import se.kth.adn.scribble.model.Lines;

import java.util.List;

import static javafx.scene.paint.Color.WHITE;

public class ScribbleView extends BorderPane {
    private Canvas canvas;
    private Button clearButton;
    private Lines model; //i detta fall låter vi view känna till modellen

    public ScribbleView(Lines model) {
        super();
        this.model = model;
        canvas = new Canvas(400, 400);
        clearButton = new Button("Clear");

        this.setCenter(canvas); //vi är en border pane!

        FlowPane pane = new FlowPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(5)); //några pixels runtom, så det ser snyggare ut
        pane.getChildren().add(clearButton);
        this.setBottom(pane);

        Controller controller = new Controller(this,model);
        addEventHandlers(controller);
    }

    private void addEventHandlers(Controller controller) {
        EventHandler<MouseEvent> mouseHandler = new EventHandler<MouseEvent>() {
            private Point2D start = null;
            private Point2D end = null;

            @Override
            public void handle(MouseEvent event) {
                if (event.getEventType() == MouseEvent.MOUSE_PRESSED) {
                    start = new Point2D(event.getX(), event.getY());
                } else if (event.getEventType() == MouseEvent.MOUSE_RELEASED) {
                    end = new Point2D(event.getX(), event.getY());
                    Line line = new Line(start, end, Color.NAVY);
                    controller.handleNewLine(line);
                }
            }
        };
        canvas.addEventHandler(MouseEvent.ANY, mouseHandler);

        EventHandler<ActionEvent> clearHandler = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                controller.handleClear();
            }
        };
        clearButton.addEventHandler(ActionEvent.ACTION, clearHandler);


    }

    public void updateCanvas() {
        List<Line> lines = model.getLines();
        GraphicsContext gc = canvas.getGraphicsContext2D();
        for (Line l : lines) {
            gc.strokeLine(l.getStart().getX(), l.getStart().getY(), l.getEnd().getX(), l.getEnd().getY());
        }

    }

    public void clearCanvas() {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setFill(WHITE);
        gc.fillRect(0, 0, this.getWidth(), this.getHeight());
        //model.clear(); inte view sak, det får controller göra!
    }

}
