import java.time.LocalDate;

public record Loan(Kayak kayak, Member borrower, LocalDate loanDate) {

    @Override
    public String toString() {
        return "Loan: [Kayak:" + kayak + "Borrower: " + borrower + "Loan time: " + loanDate + "]";
    }
}
