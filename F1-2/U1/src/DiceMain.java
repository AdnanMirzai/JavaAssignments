public class DiceMain {
    public static void main(String[] args) {

        Dice d1 = new Dice();
        Dice d2 = new Dice();
        System.out.println(d1.toString() + ", " + d2.toString());
        d1.throwDie();
        d2.throwDie();
        System.out.println(d1.toString() + ", " + d2.toString());

        int[] freq = new int[6];
        int x;
        for(int i=0; i<1000; i++) {
            d1.throwDie();
            x = d1.getValue();
            freq[x-1]++;
        }

        double nrFreq;
        for(int i=0; i<freq.length; i++) {
            nrFreq = freq[i]/10.0;
            System.out.println((i+1) + ": " + nrFreq + "%");
        }

    }
}
