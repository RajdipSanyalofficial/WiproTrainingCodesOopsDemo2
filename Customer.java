/**
 * Single Inheritance for online shopping
 */

package oopsdemo2;


public class Customer {

    private String name;
    private String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void display(){
        System.out.println("********** Customer Details ************");
        System.out.println("Customer Name    : "+name);
        System.out.println("Email            : "+email);
    }
}
