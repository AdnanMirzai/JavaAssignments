public class Dice {
    private int value;

    public Dice() {
        value = 1;
    }

    public void throwDie() {
        value = (int) (Math.random()*6)+1;
    }

    public int getValue() {
        return value;
    }

    public String toString() {
        return "Value = " + value;
    }
}