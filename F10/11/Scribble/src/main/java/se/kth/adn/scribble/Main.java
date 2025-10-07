package se.kth.adn.scribble;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import se.kth.adn.scribble.model.Lines;
import se.kth.adn.scribble.view.ScribbleView;


public class Main extends Application {
    private Lines model;

    @Override
    public void start(Stage primaryStage) {
        model = new Lines();
        ScribbleView view = new ScribbleView(model);
        Scene scene = new Scene(view);
        primaryStage.setTitle("Scribble!");
        primaryStage.setScene(scene);
        primaryStage.sizeToScene();
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}