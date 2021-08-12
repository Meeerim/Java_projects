package bankApp;
import java.util.*;

public class Bank {
    private String name;
    private Map<String,Account> accountsMap = new HashMap<>();

        
    public Bank(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Account> getAccountsMap() {
        return accountsMap;
    }

    public void registerAccount(Account account){ // accNum - 123 email - ilyaz@gmail.com   balance - 1000$
        accountsMap.put(account.getEmail(),account);
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", accountsMap=" + accountsMap +
                '}';
    }
}
