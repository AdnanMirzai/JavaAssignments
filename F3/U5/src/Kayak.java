public class Kayak {
    private final String model;
    private final KLevel level;
    private final long number;
    private Member caretaker;

    public Kayak(String model, KLevel level, long number, Member caretaker) {
        this.model = model;
        this.level = level;
        this.number = number;
        this.caretaker = caretaker;
    }

    public void setCareTaker(Member caretaker) { this.caretaker = caretaker; }

    public KLevel getLevel() { return level; }
    public long getNumber() { return number; }
    public Member getCaretaker() { return caretaker; }
    public String getModel() { return model; }

    @Override
    public String toString() {
        return "Kayak[Model: " + model + ", Level: " + level + ", Number: " + number + "]";
    }
}
