module se.kth.adn.scribble {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens se.kth.adn.scribble to javafx.fxml;
    exports se.kth.adn.scribble;
}