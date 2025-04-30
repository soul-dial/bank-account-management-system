package bank;

public abstract class  Account {

    private Client owner;

    private String accountId;

    Account(Client owner, String accountId){

        this.owner = owner;

        this.accountId = accountId;

    }

    String getAccountId(){

        return accountId;

    }


    void displayInfo(){

        System.out.println("Account Id : "+ getAccountId());

        System.out.println("Client Name : "+ owner.getFirstName()+" "+owner.getLastName());

        System.out.println("Phone number : "+ owner.getPhonenumber() );

        System.out.println("Adresse : "+ owner.getAdresse());


    }

}
