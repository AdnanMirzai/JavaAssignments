import java.time.LocalDate;

public class Patient {
    private final String name;
    private final String personalNr;
    private String journal;

    public Patient(String name, String personalNr) {
        this.name = name;
        this.personalNr = personalNr;
        this.journal = "";
    }

    public void addToJournal(String text) {
        LocalDate now = LocalDate.now();
        this.journal += "\n" + "Date: " + now + "\n" + text;
    }

    public String getName() {
        return this.name;
    }

    public String getPersonalNr() {
        return this.personalNr;
    }

    public String getJournal() {
        return this.journal;
    }

   //@Override
    public String toString() {
        return "name: " + this.name + "\nPersonal Number: " + this.personalNr + "\nJournal: " + this.journal;
    }
}
