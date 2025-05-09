import bank.Bank;
import bank.Client;

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

        while (!(choice==1 || choice==2) ){

            System.out.println(" choice only between 1 or 2");

            System.out.println("....Try gain....");

            choice = scanner.nextInt();
        }

        if(choice==1){

            Bank.createAccount();

            System.out.println("");

            System.out.println("Log in now");

        }

        Client activeClient = Bank.findClient();

        while (activeClient == null){

            System.out.println("Account doesn't exist ");

            System.out.println("....try again....");

            System.out.println("");

            activeClient = Bank.findClient();

        }


    }

}