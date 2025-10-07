package se.kth.adn.scribble.view;

import se.kth.adn.scribble.model.Line;
import se.kth.adn.scribble.model.Lines;

public class Controller { //både saker i view och model!
    private ScribbleView view;
    private Lines model;

    public Controller(ScribbleView view, Lines model) {
        this.model = model;
        this.view = view;
    }

    void handleNewLine(Line line) {
        model.add(line);
        view.updateCanvas();
    }

    void handleClear() {
        model.clear();
        view.clearCanvas();
    }

}
