import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final double INTEREST_UNDER_100k = 0.005;
        final double INTEREST_OVER_100k = 0.025;
        final double HUNDRED_K = 100000;

        double balance;
        System.out.print("Whats your balance?  ");
        balance = scan.nextDouble();
        double totalInterest;

        if(balance < 0) {
            totalInterest = 0;
        }
        else if(balance < HUNDRED_K) {
            totalInterest = (balance * INTEREST_UNDER_100k);
        }
        else {
            double over = (balance - HUNDRED_K) * INTEREST_OVER_100k;
            double rest = HUNDRED_K * INTEREST_UNDER_100k;
            totalInterest = over + rest;
        }

        System.out.printf("Your interest is: %.2f\n", totalInterest);
    }
}