public record Member(String fullName, Pnr pnr) {

    @Override
    public String toString() {
        return "Member: [Name: " + fullName + ", " + pnr.toString() + "]";
    }
}
