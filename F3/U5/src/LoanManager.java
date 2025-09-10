import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class LoanManager implements ILoanManager {
    private ArrayList<Kayak> kayaks;
    private ArrayList<Loan> loans;

    public LoanManager() {
        this.kayaks = new ArrayList<>();
        this.loans = new ArrayList<>();
    }

    public List<Kayak> getKayaks() { return new ArrayList<>(kayaks); }
    public List<Loan> getLoans() { return new ArrayList<>(loans); }

    public void addKayak(Kayak kayak) {
        if (!kayaks.contains(kayak)) {
            kayaks.add(kayak);
        }
    }

    public void addLoan(Member borrower, Kayak kayak, LocalDate loanDate) {
        for(Loan loan : loans) {
            if(loan.kayak().equals(kayak) && loan.loanDate().equals(loanDate)) {
                throw new IllegalLoanException(kayak.getModel() + ", " + loanDate);
            }
        }
        loans.add(new Loan(kayak, borrower, loanDate));
    }

    public List<Loan> getLoansFor(Kayak kayak) {
        List<Loan> kayakLoans = new ArrayList<>();
        for (Loan loan : loans) {
            if (loan.kayak().equals(kayak))
                kayakLoans.add(loan);
        }
        return kayakLoans;
    }

    public List<Kayak> getAvailableKayaks(LocalDate targetDate) {
        List<Kayak> availableKayaks = new ArrayList<>();
        for(int i=0; i<kayaks.size(); i++) {
            boolean taken = false;
            Kayak kayakTemp;
            kayakTemp = kayaks.get(i);
            for(int j=0; j<loans.size(); j++) {
                Loan loanTemp;
                loanTemp = loans.get(j);
                if(loanTemp.kayak().equals(kayakTemp) && loanTemp.loanDate().isEqual(targetDate)) {
                    taken = true;
                    break;
                }
            }
            if(!taken) {
                availableKayaks.add(kayakTemp);
            }
        }
        return availableKayaks;
    }

    @Override
    public String toString() {
        return "LoanManager: [kayaks: " + kayaks.size() + ", loans: " + loans.size() + "]";
    }
}