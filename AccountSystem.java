import java.util.ArrayList;

public class AccountSystem {

    private ArrayList<Account> accountList = new ArrayList<>();

    public ArrayList<Account> getAccountList() {
        return accountList;
    }

    public void addAccount(Account acc) {
        accountList.add(acc);
    }

    public void removeAccount(Account acc) {
        accountList.remove(acc);
    }

    public void updateAccount(Account acc) {
        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).getUsername().equals(acc.getUsername())) {
                accountList.set(i, acc);
                return;
            }
        }
    }

    // This should allow us to load database/file later
    public void loadAccount() {
        // currently empty — UML says this method exists
        // We will implement this later
    }
}
