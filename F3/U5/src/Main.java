public class Main {
    public static void main(String[] args) {
        Pnr andersPnr = Pnr.createPnr("600101-1111");
        Member anders = new Member("Anders Lindström", andersPnr);
        System.out.println(anders.toString());
    }
}
