package bank;

import java.util.Scanner;

public class SavingAcoount extends Account implements Transaction{

    double savingBalance;

    SavingAcoount(Client owner, String accountId) {

        super(owner, accountId);

         savingBalance = 0;

    }

    public void getSavingBalance() {

        System.out.println("SAVING BALANCE : "+savingBalance+"$");

    }


    public void deposit(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter amount ");

        double amount = scanner.nextDouble();

        while( amount <= 0 )
        {
            System.out.println("Enter a valid amount ");

            amount = scanner.nextDouble();

        }

            savingBalance += amount;

            System.out.println("Your deposit of "+ amount+"$"+" has been made successfully");

            this.getSavingBalance();



    }

    @Override
    public void withdraw() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter amount ");

       double amount = scanner.nextDouble();

        if( amount <= 0)
        {
            System.out.println("First Enter a valid amount");
            System.out.println("And transfert the money on your Current Account ");
            System.out.println( "Made your withdraw on your Current Acoount");

        }else {

            System.out.println( "Made your withdraw on your Current Acoount");

        }

    }

    @Override
    public void transferToanotherAccount(Account account)
    {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter amount ");

        double amount = scanner.nextDouble();

        while (amount <= 0) {

            System.out.println("Enter  a valid amount");

            amount = scanner.nextDouble();

        }

        if (this.savingBalance < amount)
        {

            System.out.println("Balance insufficant for this transaction ");

        } else
        {
            CurrentAccount currentAccount = (CurrentAccount) account;

            this.savingBalance -= amount;

            currentAccount.balance += amount;

            System.out.println("Your transaction of " + amount + "$ has been made successfully");


        }


    }

}
