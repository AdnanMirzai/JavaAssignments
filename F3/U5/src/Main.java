import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Pnr andersPnr = Pnr.createPnr("600101-1111");
        Member anders = new Member("Anders Lindström", andersPnr);

        Pnr adnanPnr = Pnr.createPnr("600900-0000");
        Member adnan = new Member("Adnan Lumpish", adnanPnr);

        System.out.println(anders.toString());
        System.out.println(adnan.toString());


        Kayak k1 = new Kayak("WKV 540", KLevel.SKILLED, 1, anders);
        Kayak k2 = new Kayak("Point 65", KLevel.EASY, 2, anders);

        LoanManager manager = new LoanManager();
        manager.addKayak(k1);
        manager.addKayak(k2);
        System.out.println(manager.toString());

        manager.addLoan(anders, k1, LocalDate.now());
        //manager.addLoan(adnan, k2, LocalDate.now());
        System.out.println(manager.toString());


        List<Kayak> available = manager.getAvailableKayaks(LocalDate.now());
        System.out.println("Available today: \n" + available.toString());

        //manager.addLoan(anders, k1, LocalDate.now());

        Kayak k3 = new Kayak("LORD", KLevel.ADVANCED, 9000, anders);
        manager.addKayak(k3);
        List<Kayak> allKayaks = manager.getKayaks();
        System.out.println("ALL KAYAKS: " + allKayaks.toString());
    }
}
