/**
 * Java Program to demonstrate Banking Transactions using Multi-Level Inheritance
 */

package oopsdemo2;

public class Account {

    private int accountNumber;
    private String name;

    public Account(int accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name = name;
    }

    public void display(){
        System.out.println("Account Number : "+accountNumber);
        System.out.println("Customer name : "+name);
    }
}

