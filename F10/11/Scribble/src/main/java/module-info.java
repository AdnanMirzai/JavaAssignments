module se.kth.adn.scribble {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires javafx.graphics;
    requires javafx.base;

    opens se.kth.adn.scribble to javafx.fxml;
    exports se.kth.adn.scribble;
}