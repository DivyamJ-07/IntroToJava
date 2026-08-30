/*Account requirements:

- private String accountNumber
- private String ownerName
- private double balance
- constructor with account number and owner; initial balance is zero
- overloaded constructor accepting a valid non-negative opening balance
- boolean deposit(double amount)
- boolean withdraw(double amount)
- getters, but no public setBalance()
- String toString()

*/
public class Account {
    private String AccNum;
    private String OwnerName;
    private double Balance;

    public Account(String AccNum, String OwnerName) {
        this(AccNum, OwnerName, 0.0);
    }

    public Account(String AccNum, String OwnerName, double Balance) {
        this.AccNum = AccNum ;
        this.OwnerName = OwnerName;

        if (Balance >= 0)
            this.Balance = Balance;
    }

    public boolean deposit(double amount) {
        if (amount <= 0) {
            return false;
        }
        Balance += amount;
        return true;
    }

    public boolean withdraw(double amount) {
        if (amount <= 0 || amount > Balance) {
            return false;
        }

        Balance -= amount;
        return true;
    }

    public String GetAccNum() {
        return AccNum;
    }

    public String GetownerName() {
        return OwnerName;
    }

    public double GetBalance() {
        return Balance;
    }

    @Override
    public String toString() {
        return "Account{AccountNumber='" + AccNum + "', OwnerName='" + OwnerName
                + "', Balance=" + Balance + "}";
    }
}