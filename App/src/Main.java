import bank.Bank;
import bank.Client;
import bank.CurrentAccount;
import bank.SavingAcoount;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

        System.out.println("------------------------------");

        System.out.println("WELCOME IN OUR BANK S-D BANK");

        System.out.println("------------------------------");

        System.out.println("");

        System.out.println("1- create an account ");
        System.out.println("2- Log in ");

        int choice = scanner.nextInt();

        while (!(choice==1 || choice==2)){

            System.out.println(" choice only between 1 or 2");

            System.out.println("....Try gain....");

            choice = scanner.nextInt();
        }

        if(choice==1){

            Bank.createAccount();

            System.out.println("");

            System.out.println("Log in now");

        }

        Client user = Bank.findClient();

        while (user== null){

            System.out.println("Account doesn't exist ");

            System.out.println("....try again....");

            System.out.println("");

            user = Bank.findClient();

        }


        CurrentAccount userCurrentAccount = user.getCurrentAccount();

        SavingAcoount userSavingAccount = user.getSavingAcoount();

        System.out.println("1-Deposit");
        System.out.println("2-withdraw");
        System.out.println("3-Transaction between Account");

        choice = scanner.nextInt();

        while (!(choice==1 || choice==2 || choice==3)){

            System.out.println(" choice only between 1 , 2 or 3");

            System.out.println("....Try gain....");

            choice = scanner.nextInt();
        }



    }

}