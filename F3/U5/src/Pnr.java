public class Pnr {
    private final String pnrStr;
    private static final String pnrPattern = "^(19|20)?[0-9]{6}[- ]?[0-9]{4}$";

    public static Pnr createPnr(String pnrStr) throws IllegalArgumentException {
        if(!pnrStr.matches(pnrPattern)) throw new IllegalArgumentException("Illegal pnr: "  + pnrStr);
        return new Pnr(pnrStr);
    }

    public String getPnrStr() {
        return pnrStr;
    }

    @Override
    public String toString() {
        return "ssn: " + pnrStr;
    }

    private Pnr(String pnrStr) throws IllegalArgumentException {
        this.pnrStr = pnrStr;
    }
}