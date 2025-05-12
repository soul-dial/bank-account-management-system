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

        System.out.println();

        int leave;

        do {

            System.out.println("1- create an account ");
            System.out.println("2- Log in ");

            int choice = scanner.nextInt();

            while (!(choice == 1 || choice == 2)) {

                System.out.println(" choice only between 1 or 2");

                System.out.println("....Try gain....");

                choice = scanner.nextInt();
            }

            if (choice == 1) {

                Bank.createAccount();

                System.out.println();

                System.out.println("Log in now");

            }

            Client user = Bank.findClient();

            while (user == null) {

                System.out.println("Account doesn't exist ");

                System.out.println("....try again....");

                System.out.println();

                user = Bank.findClient();

            }


            CurrentAccount userCurrentAccount = user.getCurrentAccount();

            SavingAcoount userSavingAccount = user.getSavingAcoount();

            System.out.println("1-Current Account");
            System.out.println("2-Saving Account");
            System.out.println("3-Show Account information");

            choice = scanner.nextInt();

            while (!(choice == 1 || choice == 2 || choice == 3)) {

                System.out.println(" choice only between 1 , 2 or 3");

                System.out.println("....Try gain....");

                choice = scanner.nextInt();
            }

            int secondChoice;


            if (choice == 1) {

                System.out.println("1- Show Balance");
                System.out.println("2- Deposit ");
                System.out.println("3- Withdraw");
                System.out.println("4-Transaction from Current Account to Saving Account");

                secondChoice = scanner.nextInt();

                while (!(secondChoice == 1 || secondChoice == 2 || secondChoice == 3 || secondChoice == 4)) {

                    System.out.println(" choice only between 1 , 2 , 3 or 4");

                    System.out.println("....Try gain....");

                    secondChoice = scanner.nextInt();
                }


                switch (secondChoice) {

                    case 1:
                        userCurrentAccount.getBalance();
                        break;

                    case 2:
                        userCurrentAccount.deposit();
                        break;

                    case 3:
                        userCurrentAccount.withdraw();
                        break;

                    case 4:
                        userCurrentAccount.transferToanotherAccount(userSavingAccount);
                        break;

                    default:
                        System.out.println("..........");

                }

            } else if (choice == 2) {

                System.out.println("1- Show Balance");
                System.out.println("2- Deposit ");
                System.out.println("3- Withdraw");
                System.out.println("4-Transaction from Saving Account to Current Account");

                secondChoice = scanner.nextInt();

                while (!(secondChoice == 1 || secondChoice == 2 || secondChoice == 3 || secondChoice == 4)) {

                    System.out.println(" choice only between 1 , 2 , 3 or 4");

                    System.out.println("....Try gain....");

                    secondChoice = scanner.nextInt();
                }


                switch (secondChoice) {

                    case 1:
                        userSavingAccount.getSavingBalance();
                        break;

                    case 2:
                        userSavingAccount.deposit();
                        break;

                    case 3:
                        userSavingAccount.withdraw();
                        break;

                    case 4:
                        userSavingAccount.transferToanotherAccount(userCurrentAccount);
                        break;

                    default:
                        System.out.println("..........");

                }

            } else {

                user.displayInfo();

            }


            System.out.println("1-Leave the App");
            System.out.println("0-Stay on the App");

            leave = scanner.nextInt();

        }while(leave!=1);


    }

}