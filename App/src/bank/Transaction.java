package bank;

public interface Transaction {

    void deposit(double amount);

    void withdraw(double amount );

    void transferToanotherAccount(Account account , double amount);
}
