
package oopsdemo2;

import java.util.Scanner;

public class BankingApplication {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("********** Welcome to Soft Bank ************");

        System.out.println("Enter Account Number & Customer Name:");
        int accountNumber=scanner.nextInt();
        String name=scanner.next();

        final float MIN_BAL=1000;
        final double BALANCE=5000; // Initial Balance while creating SavingsAccount

        System.out.println("Enter Amount to be Deposited : ");
        double deposit=scanner.nextDouble();
        System.out.println("Enter Amount to Withdrawal :");
        double withdrawal=scanner.nextDouble();

        //Create Object of AccountTransactions

        AccountTransactions transactions1 = new AccountTransactions(accountNumber,name,MIN_BAL,BALANCE,withdrawal,deposit);

        transactions1.display();
        scanner.close();
    }
}



