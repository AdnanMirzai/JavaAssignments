public class U3 {
    public static void main(String[] args) {
        int die;
        int[] frequency = new int[6];

        for(int i=0; i<1000; i++) {
            die = (int) (Math.random()*6+1);
            if(die == 1) frequency[0]++;
            else if(die == 2) frequency[1]++;
            else if(die == 3) frequency[2]++;
            else if(die == 4) frequency[3]++;
            else if(die == 5) frequency[4]++;
            else frequency[5]++;
        }

        for(int i=0; i<6; i++) {
            System.out.print("Frequency " + (i+1) + ": ");
            System.out.println(frequency[i]);
        }
    }
}