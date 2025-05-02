package bank;

public class CurrentAccount extends Account implements Transaction{

    private double balance; //

    CurrentAccount(Client owner, String accountId) {

        super(owner, accountId);

        balance = 0;
    }

    public void getBalance() {

        System.out.println("BALANCE OF ACCOUNT : "+balance+"$");

    }

    @Override
    public void deposit(double amount) {

        if(amount< 0 ){

            System.out.println("Enter a valid amount");

        }else{

           balance += amount;

            System.out.println("Your deposit of "+ amount+"$"+" has been made successfully");

            this.getBalance();

        }
    }

    public void withdraw(double amount)
    {

       if(amount<0)
       {

           System.out.println("Enter a valid amount");
       }
       else
       {
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


    }
}
