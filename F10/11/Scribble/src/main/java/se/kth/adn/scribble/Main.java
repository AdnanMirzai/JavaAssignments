package se.kth.adn.scribble;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Point2D;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application {
    private Canvas canvas;

    @Override
    public void start(Stage primaryStage) {
        this.canvas = new Canvas(500,500);
        canvas.addEventHandler(MouseEvent.ANY, new MouseHandler());

        BorderPane root = new BorderPane();
        root.setCenter(canvas);

        Button clearButton = new Button("Clear");
        FlowPane pane = new FlowPane();
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(5)); //några pixels runtom, så det ser snyggare ut
        pane.getChildren().add(clearButton);
        root.setBottom(pane);

        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.sizeToScene();

        primaryStage.setTitle("Scribble!");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private class MouseHandler implements EventHandler<MouseEvent> {
        private Point2D start = null;

        @Override
        public void handle(MouseEvent event) {
            if(event.getEventType() == MouseEvent.MOUSE_PRESSED) {
                start = new Point2D(event.getX(), event.getY());
            }
            else if (event.getEventType() == MouseEvent.MOUSE_RELEASED) {
                GraphicsContext gc = canvas.getGraphicsContext2D();
                gc.strokeLine(start.getX(), start.getY(), event.getX(), event.getY());
            }
        }
    }

}