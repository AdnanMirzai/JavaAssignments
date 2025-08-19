import java.util.Random;

public class Main {
    public static void main(String[] args) {
    Random rand = new Random();
    boolean[] exists = new boolean[35];
    int buff;

    for(int i=0; i<7; i++) {
        buff = rand.nextInt(35)+1;
        if(!exists[buff-1]) {
            exists[buff-1] = true;
            System.out.println(buff + " ");
        }
        else i--;
    }

    }


}

