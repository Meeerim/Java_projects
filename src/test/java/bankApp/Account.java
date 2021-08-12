package bankApp;

public class Account {
    private int accountNum;
    private String email;
    private double balance;
    private double amountSentToday;

        
    public Account(int accountNum, String email, double balance) {
        this.accountNum = accountNum;
        this.email = email;
        this.balance = balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withDraw(double amount){
        if (balance < amount){
            System.err.println("У вас недостаточно средств");
            return;
        }
        balance-= amount;
    }

    public void transferViaMbank(String emailOfReceiver, double amount, Bank bank){
        if (amountSentToday + amount > 2000){
            System.out.println("Вы превысили лимит");
            return;
        }
        withDraw(amount);
        bank.getAccountsMap().get(emailOfReceiver).deposit(amount);
        amountSentToday += amount;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAmountSentToday() {
        return amountSentToday;
    }

    public void setAmountSentToday(double amountSentToday) {
        this.amountSentToday = amountSentToday;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNum=" + accountNum +
                ", email='" + email + '\'' +
                ", balance=" + balance +
                ", amountSentToday=" + amountSentToday +
                '}';
    }
}
