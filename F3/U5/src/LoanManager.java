import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class LoanManager  {
    private ArrayList<Kayak> kayaks;
    private ArrayList<Loan> loans;

    public LoanManager() {
        this.kayaks = new ArrayList<>();
        this.loans = new ArrayList<>();
    }

    public List<Kayak> getKayaks() { return new ArrayList<>(kayaks); }
    public List<Loan> getLoans() { return new ArrayList<>(loans); }

    void addKayak(Kayak kayak) {
        if (!kayaks.contains(kayak))  kayaks.add(kayak);
    }
    void addLoan(Member borrower, Kayak kayak, LocalDate loanDate) {
        loans.add(new Loan(kayak, borrower, loanDate));
    }

}
