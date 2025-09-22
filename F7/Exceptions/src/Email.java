import java.util.regex.Pattern;

public class Email {

    private final String emailString;

    public static Email emailMaker(String text) {
        if(!Pattern.matches("^[a-z0-9+_.-]+@[a-z.]+$", text)) {
            throw new IllegalEmailAdressException("Not an Email adress!" + text);
        }
        return new Email(text);
    }

    private Email(String text) { this.emailString = text; }

    public String getAsString() { return emailString; }

    public boolean equals(Object obj) {
        if(obj instanceof Email temp) {
            return temp.emailString.equalsIgnoreCase(this.emailString);
        }
        return false;
    }

}
