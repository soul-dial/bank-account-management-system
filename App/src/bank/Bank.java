package bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Bank {

   public static List<Client > clientList = new ArrayList<>();

    private static List<SavingAcoount> savingAccountList = new ArrayList<>();

    private static List<CurrentAccount> currentAccountList = new ArrayList<>();

    private static Client createClient (){

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


   private static String generateAccountId ()
   {

     int[]numbers = new int[9];

       for (int i = 0; i < 9; i++)
       {
           //genrere randomly 9 chiffres entre 0 et 9 pour remplit le tableau

            numbers[i] = (int)(Math.random()*10);

       }

     //contenation des chiffres du tableau en String

       return ""+numbers[0]+numbers[1]+numbers[2]
              +"-"+numbers[3]+numbers[4]+numbers[5]
              +"-"+numbers[6]+numbers[7]+numbers[8];



   }

  public static void createAccount()
  {
      Client owner = createClient();

      String accountId = generateAccountId();

   CurrentAccount cAccount = new CurrentAccount(owner,accountId);

   SavingAcoount sAccount  = new SavingAcoount(owner,accountId);

   owner.setCurrentAccount(cAccount);

   owner.setSavingAcoount(sAccount);

   clientList.add(owner);

   savingAccountList.add(sAccount);

   currentAccountList.add(cAccount);

   System.out.println("YOUR ACCOUNT HAS BEEN SUCCESSFULLY CREATE!!!!");

   owner.displayInfo();


  }

  public static Client findClient()
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


             return clientWanted;
         }
      }

      return null;
  }




  public void deleteAccount(){

        Client clientFind = findClient();

        String accountIdTodelete = null;

        if (clientFind ==null)
        {
            System.out.println("THAT ACCOUNT CANNOT BE FOUND");

        }
        else
        {
          for(CurrentAccount wantedAccount: currentAccountList)
          {

              if(wantedAccount.owner.equals(clientFind))
              {

              accountIdTodelete = wantedAccount.accountId;

              currentAccountList.remove(wantedAccount);

              }
          }

          for (SavingAcoount wantedAcoount : savingAccountList)
          {
              if(wantedAcoount.accountId.equals(accountIdTodelete))
              {
               savingAccountList.remove(wantedAcoount) ;


              }

          }

        }


    }







}
