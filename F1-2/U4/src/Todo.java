import java.time.LocalDateTime;

public class Todo {
    private final String title;
    private String description;
    private LocalDateTime lastUpdate;
    private boolean done;

    public Todo(String title, String description) {
        this.title = title;
        this.description = description;
        this.lastUpdate = LocalDateTime.now();
        this.done = false;
    }

    public void addToDescription(String text) {
        this.description += ", " + text;
        changeTime();
    }
    private void changeTime() {this.lastUpdate = LocalDateTime.now();}

    public void taskDone() {this.done = true;}

    public String getTitle() {return this.title;}
    public String getDescription() {return this.description;}
    public LocalDateTime getLastUpdate() {return this.lastUpdate;}
    public boolean getTaskDone() {return this.done;}

    @Override
    public String toString() {
        return "Task: " + this.title + "\nDescription: "
                + description + "\nLast update: " + lastUpdate + "\nDone?: " + done + "\n\n";
    }
}
