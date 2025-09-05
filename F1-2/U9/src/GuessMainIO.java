import java.util.Scanner;
public class GuessMainIO {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GuessMyNrModel guessModel = new GuessMyNrModel(100);

        String keepGoing = "y";

        while(keepGoing.toLowerCase().charAt(0) == 'y') {

            guessModel.initGame();
            int guess;
            do {
                System.out.println("Make a guess: [1 - " + guessModel.getUpperLimit() + "]");
                guess = scan.nextInt();
                scan.nextLine(); //important, scan.NextInt leaves /n char! 
                guessModel.setGuess(guess);
                System.out.println("Your guess is " + guessModel.compareGuessToStr());
                System.out.println("Number of guesses: " + guessModel.getNrOfGuesses());
            }
            while(guess != guessModel.getSecret());
            System.out.println("Congratulations!");
            System.out.println("Continue (y/n)? ");
            keepGoing = scan.nextLine();
        }
        System.out.println("Bye Bye!");
        scan.close();
    }
}