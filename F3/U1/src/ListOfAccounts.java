import java.util.ArrayList;

public class ListOfAccounts {
    ArrayList<Account> theAccounts;

    public ListOfAccounts() {
        theAccounts = new ArrayList<>();
    }

    public void addAccount(Account a) {
        theAccounts.add(a);
    }

    public double getTotalBalance() {
        double total = 0;
        for (Account theAccount : theAccounts) {
            total = total + theAccount.getBalance();
        }
        return total;
    }

    public Account findAccount(String name) {
        Account a = null;
        String foundName;
        for (Account theAccount : theAccounts) {
            foundName = theAccount.getName();
            if (foundName.equals(name)) { // Not ==!
                a = theAccount;
                break;
            }
        }
        return a;
    }

    public Account[] getTheAccounts() {
        Account[] copy = new Account[theAccounts.size()];
        for (int i = 0; i < theAccounts.size(); i++) {
            copy[i] = theAccounts.get(i);
        }
        return copy;
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder();
        info.append("The accounts\n");
        info.append("============\n");
        for (Account theAccount : theAccounts) {
            info.append(theAccount.toString()).append("\n");
        }
        return info.toString();
    }
}