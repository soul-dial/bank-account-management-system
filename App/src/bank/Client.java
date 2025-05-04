package bank;

import java.util.Objects;

public class Client {

    private String firstName;
    private String middleName;
    private String lastName;
    private String phonenumber;
    private String adresse;

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

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    String getPhonenumber() {
        return phonenumber;
    }

    String getAdresse() {
        return adresse;
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
