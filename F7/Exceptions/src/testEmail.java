public class testEmail {
    public static void main(String[] args) {
        Email em = Email.emailMaker("anders@kth.com");
        Email rm2 = Email.emailMaker("anders@kth.com");
        System.out.println(em.equals(rm2));
    }
}
