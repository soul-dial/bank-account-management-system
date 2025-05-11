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



    }

}
