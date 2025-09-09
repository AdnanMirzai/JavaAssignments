public record Member(String fullName, Pnr pnr) {

    @Override
    public String toString() {
        return "Member: " + "[full Name: " + fullName + ", ssn: " + pnr + "]";
    }
}
