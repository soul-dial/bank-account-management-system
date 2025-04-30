package bank;

public class CurrentAccount extends Account implements Transaction{

    private double balance;

    CurrentAccount(Client owner, String accountId) {

        super(owner, accountId);

        balance = 0;
    }

    public void getBalance() {


        System.out.println("BALANCE OF ACCOUNT : "+balance+"$");

    }
}
