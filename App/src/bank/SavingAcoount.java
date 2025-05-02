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


    public void deposit(double amount){

        if( amount <0 )
        {
            System.out.println("Enter a valid amount ");

        }

        else
        {
            savingBalance += amount;

            System.out.println("Your deposit of "+ amount+"$"+" has been made successfully");

            this.getSavingBalance();

        }


    }

    @Override
    public void withdraw(double amount) {

        if( amount < 0)
        {
            System.out.println("First Enter a valid amount");
            System.out.println("And transfert the money on your Current Account ");
            System.out.println( "Made your withdraw on your Current Acoount");

        }else {

            System.out.println( "Made your withdraw on your Current Acoount");

        }

    }
}
