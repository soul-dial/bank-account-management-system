package bank;

import java.util.Objects;

public class Client {

    private String firstName;
    private String middleName;
    private String lastName;
    private String phonenumber;
    private String adresse;
    private CurrentAccount currentAccount ;
    private SavingAcoount  savingAcoount;

    Client(String firstName, String middleName,String lastName, String phonenumber,String adresse ){

        this.firstName = firstName;

        this.middleName = middleName;

        this.lastName = lastName;

        this.adresse = adresse;

        this.phonenumber = phonenumber;

    }

    Client(String firstName, String middleName,String lastName){

        this.firstName = firstName;

        this.middleName = middleName;

        this.lastName = lastName;

        this.adresse ="";

        this.phonenumber ="";

    }

    private String getFirstName() {
        return firstName;
    }

    private String getLastName() {
        return lastName;
    }

    private String getMiddleName() {
        return middleName;
    }

    private String getPhonenumber() {
        return phonenumber;
    }

    private String getAdresse() {
        return adresse;
    }

    public void displayInfo() {

        System.out.println("Account Id : " + this.currentAccount.getAccountId());

        System.out.println("Client Name : " + getFirstName() + " " + getLastName());

        System.out.println("Phone number : " + getPhonenumber());

        System.out.println("Adresse : " + getAdresse());

    }

    public CurrentAccount getCurrentAccount() {
        return currentAccount;
    }

    public SavingAcoount getSavingAcoount() {
        return savingAcoount;
    }

    void setCurrentAccount(CurrentAccount currentAccount) {
        this.currentAccount = currentAccount;
    }

    void setSavingAcoount(SavingAcoount savingAcoount) {
        this.savingAcoount = savingAcoount;
    }
    @Override
     public boolean equals(Object obj)
    {

        if(this == obj) return true;

        if ( !(obj == null) && (obj instanceof Client) )
        {
            Client c = (Client) obj;

            if (this.firstName.equals(c.getFirstName())  && this.lastName.equals(c.getLastName())  && this.middleName.equals(c.getMiddleName()))
            {
               return true;

            }

        }

        return false;
    }



    @Override
    public int hashCode() {

        return Objects.hash(firstName,lastName,middleName);
    }
}
