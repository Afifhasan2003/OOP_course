import java.util.Scanner;


public class Main {
    static Scanner input = new Scanner(System.in);
    static int i=3;

    public static void main(String[] args) {

        Account person1 = new CurrentAcc("afif", "1001", 200.2f );
        Account person2 = new CurrentAcc("hasan", "2020", 6000.2f);
        Account person3 = new CurrentAcc("rafi", "3000");
        int k = 50;
        int answer =1;
        int numberOfAccounts = 3;


        Account[] accounts = new Account[k];
        String [] newObject = new String[k];
        accounts[0] = person1;
        accounts[1] = person2;
        accounts[2] = person3;

        while (answer == 1) {
            System.out.println("what to do");
            System.out.println("1. Create account");
            System.out.println("2. Show account");
            System.out.println("3. Transfer money");
            System.out.println("4. Print name");
            System.out.println("5. balance");
            System.out.println("6. Print Id");
            System.out.println("7. Credit account");
            System.out.println("8. Debit account");
            System.out.println("9. Show All accounts");
            int task = input.nextInt();

        if (task == 1) {

            System.out.println("Enter Details:(name,id,balance) ");
            String name = input.next();
            String id = input.next();
            float balance = input.nextFloat();

            createAccount(name,id,balance,accounts);
            numberOfAccounts++;


        }



        if (task == 2) {

            System.out.println("Which account do you want to show?");
            int from = input.nextInt() -1;
            System.out.println(accounts[from].toString());

        }
        else if (task == 3) {
            System.out.println("From: ");
            int from = input.nextInt() -1;
            System.out.println("to: ");
            int to = input.nextInt() -1 ;
            System.out.println("how much");
            float money = input.nextFloat();

            accounts[from].transferTo(accounts[to],money);


            }

        else if (task == 4) {
            System.out.println("Your account: ");
            int my = input.nextInt() -1 ;
            System.out.println(accounts[my].getName());
        }
        else if (task == 5) {
            System.out.println("Your account: ");
            int my = input.nextInt() -1 ;
            System.out.println(accounts[my].getBalance());
        }
        else if (task == 6) {
            System.out.println("Your account: ");
            int my = input.nextInt() -1 ;
            System.out.println(accounts[my].getId());
        }
        else if (task == 7) {
            System.out.println("Your account: ");
            int my = input.nextInt()-1 ;
            System.out.println("How much: ");
            float money = input.nextFloat();
            accounts[my].credit(money);
        }
        else if (task == 8) {
            System.out.println("Your account: ");
            int my = input.nextInt() -1 ;
            System.out.println("How much: ");
            float money = input.nextFloat();
            accounts[my].debit(money);
        }
        else if (task == 9) {
            for (int i=0; i<numberOfAccounts; i++){
                System.out.println(accounts[i].toString());
            }
        }


            System.out.println("Again? (1/0)");
            answer = input.nextInt();

        }

    }




    static void createAccount(String name, String id, Float balance ,Account accounts[]){
        System.out.println("Which type of account: ");
        System.out.println("1. Current Account");
        System.out.println("2.Saving Account");
        System.out.println("3.Depositing Account");


        int accType = input.nextInt();

        if (accType == 1){


            accounts[i] = new CurrentAcc(name,id,balance);
            i++;
        }

        else if (accType == 2){
            accounts[i] = new SavingsAcc(name,id,balance);
            i++;
        }
        else if (accType == 3){
            accounts[i] = new DepositAcc(name,id,balance);
            i++;
        }





    }

}

