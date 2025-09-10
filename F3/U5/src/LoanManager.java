import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class LoanManager {
    private ArrayList<Kayak> kayaks;
    private ArrayList<Loan> loans;

    public LoanManager() {
        this.kayaks = new ArrayList<>();
        this.loans = new ArrayList<>();
    }

    public List<Kayak> getKayaks() { return new ArrayList<>(kayaks); }
    public List<Loan> getLoans() { return new ArrayList<>(loans); }

    void addKayak(Kayak kayak) {
        if (!kayaks.contains(kayak)) {
            kayaks.add(kayak);
        }
    }
    void addLoan(Member borrower, Kayak kayak, LocalDate loanDate) {

        loans.add(new Loan(kayak, borrower, loanDate));
    }

    List<Loan> getLoansFor(Kayak kayak) {
        List<Loan> kayakLoans = new ArrayList<>();
        for (Loan loan : loans) {
            if (loan.kayak().equals(kayak))
                kayakLoans.add(loan);
        }
        return kayakLoans;
    }

    List<Kayak> getAvailableKayaks(LocalDate targetDate) {
        List<Kayak> availableKayaks = new ArrayList<>();
        for(Loan loan : loans) {
            if(!loan.localDate().equals(targetDate)) {
                availableKayaks.add(loan.kayak());
            }
        }
        return availableKayaks;
    }

}
