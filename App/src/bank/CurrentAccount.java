package bank;

import java.util.Scanner;

public class CurrentAccount extends Account implements Transaction{

     double balance; //

    CurrentAccount(Client owner, String accountId) {

        super(owner, accountId);

        balance = 0;
    }

    public void getBalance() {

        System.out.println("BALANCE OF ACCOUNT : "+balance+"$");

    }

    @Override
    public void deposit() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter amount ");

        double amount = scanner.nextDouble();

        while (amount <= 0 )
        {
            System.out.println("Enter a valid amount");

            amount = scanner.nextDouble();

        }

            balance += amount;

            System.out.println("Your deposit of "+ amount+"$"+" has been made successfully");

            this.getBalance();

        }


    public void withdraw()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter amount ");

        double amount = scanner.nextDouble();

       while (amount <= 0)
       {

           System.out.println("Enter a valid amount");

           amount = scanner.nextDouble();

       }

           if (this.balance < amount)
           {

               System.out.println("Balance insufficant ");

               this.getBalance();
           }

           else
           {
               balance -= amount;

               System.out.println("Your withdraw of "+ amount+"$"+" has been made successfully");

               this.getBalance();

           }



    }

    @Override
    public void transferToanotherAccount(Account account)
    {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter amount ");

        double amount = scanner.nextDouble();

        while (amount <= 0)
        {

            System.out.println("Enter  a valid amount");

            amount = scanner.nextDouble();
        }


           if (this.balance < amount)
           {

               System.out.println("Balance insufficant for this transaction ");

           }
           else
           {
               SavingAcoount saving = (SavingAcoount) account;

               this.balance -= amount;

               saving.savingBalance += amount;

               System.out.println("Your transaction of "+amount+"$ has been made successfully on your Saving Account");


           }

    }
}


