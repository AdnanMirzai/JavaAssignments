import java.time.LocalDate;

public record Loan(Kayak kayak, Member borrower, LocalDate localDate) {

    @Override
    public String toString() {
        return "Loan: [Kayak:" + kayak + "Borrower: " + borrower + "Loan time: " + localDate + "]";
    }
}
