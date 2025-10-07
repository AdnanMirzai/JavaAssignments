package se.kth.adn.scribble.model;

import java.util.ArrayList;
import java.util.List;

public class Lines {
    private final ArrayList<Line> lines;


    public Lines() {
        lines = new ArrayList<>();
    }
    
    public void clear() {
        lines.clear();
    }
    
    public int size() {
        return lines.size();
    }
    
    public void add(Line line) {
        lines.add(line);
    }
    
    public List<Line> getLines() {
        return (ArrayList<Line>) lines.clone();
    }
}

