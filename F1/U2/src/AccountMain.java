public class AccountMain {
    public static void main(String[] args) {
        Account3 acc = new Account3("Anders", 1000.0, 123456);
        long accNr = acc.getAccountNr();
        System.out.println("account number: " + accNr);
        System.out.println(acc.toString());
    }
}
