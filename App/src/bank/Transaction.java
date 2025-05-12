package bank;

public interface Transaction {

    void deposit();

    void withdraw();

    void transferToanotherAccount(Account account );
}
