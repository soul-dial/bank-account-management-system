package bank;

public class SavingAcoount extends Account implements Transaction{

    private double savingBalance;

    SavingAcoount(Client owner, String accountId) {

        super(owner, accountId);

         savingBalance = 0;

    }

    public void getSavingBalance() {

        System.out.println("SAVING BALANCE : "+savingBalance+"$");

    }


}
