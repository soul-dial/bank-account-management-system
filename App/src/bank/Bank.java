package bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Bank {

    private static List<Client > clientList = new ArrayList<>();

    private static List<SavingAcoount> savingAcoountsList = new ArrayList<>();

    private static List<CurrentAccount> currentAccountList = new ArrayList<>();


    private Client createClient (){

        Scanner scanner = new Scanner(System.in);

        String firstName,lastName,phoneNumber,adress;

        System.out.println("Enter your firstname : ");

        firstName = scanner.nextLine().toUpperCase();

        System.out.println("Enter your lastname : ");

        lastName = scanner.nextLine().toUpperCase();

        System.out.println("Enter your adress ");

        adress = scanner.nextLine();

        System.out.println("Enter your phonenumber");

        phoneNumber = scanner.nextLine();


        return new Client(firstName,lastName,phoneNumber,adress);

    }




}
