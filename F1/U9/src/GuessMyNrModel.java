import java.util.Random;

public class GuessMyNrModel {
    private int number;
    private int guess;
    private int nrOfGuesses;
    private final int upperLimit;
    private Random rand = new Random();

    public GuessMyNrModel(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    public void initGame() {
        number = rand.nextInt(this.upperLimit);
        guess = 0;
        nrOfGuesses = 0;
    }

    public int getNrOfGuesses() {return nrOfGuesses;}
    public int getUpperLimit() {return upperLimit;}
    public int getSecret() {return number;}

    public void setGuess(int guess) {
        this.guess = guess;
        nrOfGuesses++;
    }

    public int compareGuess() {
        //noinspection UseCompareMethod
        if (guess == number) return 0;
        else if (guess>number) return 1;
        else return -1;
    }

    public String compareGuessToStr() {
        if (guess == number) return "Correct";
        else if (guess>number) return "Too high";
        else return "too low";
    }
}