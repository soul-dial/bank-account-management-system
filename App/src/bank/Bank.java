package bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Bank {

    private static List<Client > clientList = new ArrayList<>();

    private static List<SavingAcoount> savingAccountList = new ArrayList<>();

    private static List<CurrentAccount> currentAccountList = new ArrayList<>();


    private Client createClient (){

        Scanner scanner = new Scanner(System.in);

        String firstName,middleName,lastName,phoneNumber,adress;

        System.out.println("Enter your firstname : ");

        firstName = scanner.nextLine().toUpperCase();

        System.out.println("Enter your middlename : ");

        middleName = scanner.nextLine().toUpperCase();

        System.out.println("Enter your lastname : ");

        lastName = scanner.nextLine().toUpperCase();

        System.out.println("Enter your adress ");

        adress = scanner.nextLine();

        System.out.println("Enter your phonenumber");

        phoneNumber = scanner.nextLine();


        return new Client(firstName,middleName,lastName,phoneNumber,adress);

    }


   private String generateAccountId ()
   {

     int[]numbers = new int[9];

       for (int i = 0; i < 9; i++)
       {

           numbers[i] = (int)(Math.random()*10);

       }

    String id =""+numbers[0]+numbers[1]+numbers[2]
              +"-"+numbers[3]+numbers[4]+numbers[5]+"-"
              +"-"+numbers[6]+numbers[7]+numbers[8];

       return id;

   }

  public void createAccount()
  {
      Client owner = createClient();

      String accountId = generateAccountId();

   CurrentAccount cAccount = new CurrentAccount(owner,accountId);

   SavingAcoount sAccount  = new SavingAcoount(owner,accountId);

   this.clientList.add(owner);

   this.savingAccountList.add(sAccount);

   this.currentAccountList.add(cAccount);


  }

  private Client findClient()
  {

    Scanner scanner = new Scanner(System.in);

    String firstname,middlename,lastname;

    Client clientWanted;

      System.out.println("Enter your firstname ");

      firstname = scanner.nextLine().toUpperCase();

      System.out.println("Enter your lastname");

      lastname = scanner.nextLine().toUpperCase();

      System.out.println("Enter your middlename");

      middlename = scanner.nextLine().toUpperCase();

      clientWanted= new Client(firstname,middlename,lastname);

      for (Client client : clientList)
      {
         if(client.equals(clientWanted))
         {
             clientWanted = client;

         }

      }

      return clientWanted;

  }






}
