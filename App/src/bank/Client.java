package bank;

public class Client {

    private String firstName;
    private String lastName;
    private String phonenumber;
    private String adresse;

    Client(String firstName, String lastName, String phonenumber,String adresse ){


        this.firstName = firstName;

        this.lastName = lastName;

        this.adresse = adresse;

        this.phonenumber = phonenumber;

    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    String getPhonenumber() {
        return phonenumber;
    }

    String getAdresse() {
        return adresse;
    }
}
