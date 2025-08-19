import java.util.Scanner;

public class U4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int burrNr;
        int buff;

        do {
            System.out.print("Ange ett Burrtal mellan 2-9: ");
            buff = scan.nextInt();
        }
        while(buff<2||buff>9);
        burrNr = buff;

        for(int i=1; i<=99; i++) {
            if(i==burrNr ||i%burrNr==0 ||checkTens(burrNr,i) ||checkFirstDigit(burrNr,i))
                System.out.print("burr ");
            else System.out.print(i + " ");
            if(i%10==0) System.out.println();
        }
    }

    static boolean checkTens(int burrNr, int index) {
        for(int i=1; i<10; i++) {
            if(index - i*10 == burrNr) return true;
        }
        return false;
    }

    static boolean checkFirstDigit(int burrNr, int index) {
        return index / 10 == burrNr;
    }
}