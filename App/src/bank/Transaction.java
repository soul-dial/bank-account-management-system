package bank;

public interface Transaction {

    void deposit(double amount);

    void withdraw(double amount );

    void depositOnanotherAccount( Account account , double amount);
}
