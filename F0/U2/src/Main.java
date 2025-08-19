import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 5;
        int[] numbers = new int[n];
        int buff;

        System.out.println("Please input whole numbers");
        for(int i=0; i<numbers.length; i++) {
            buff = scan.nextInt();
            if(buff>0) {
                numbers[i] = buff;
            }
            else {
                System.out.println("ERROR: NOT WHOLE NUMBER!");
                i--;
            }
        }

        for(int i=numbers.length-1; i>=0; i--) {
            System.out.println(numbers[i]);
        }
    }
}