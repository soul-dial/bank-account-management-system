package bank;

public abstract class  Account {

     Client owner;

     String accountId;

    Account(Client owner, String accountId){

        this.owner = owner;

        this.accountId = accountId;

    }

   public  String getAccountId(){

        return accountId;

    }


    public void displayInfo(){

        System.out.println("Account Id : "+ getAccountId());

        System.out.println("Client Name : "+ owner.getFirstName()+" "+owner.getLastName());

        System.out.println("Phone number : "+ owner.getPhonenumber() );

        System.out.println("Adresse : "+ owner.getAdresse());


    }

}
