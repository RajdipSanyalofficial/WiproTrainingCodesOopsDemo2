/**
 * Program to demonstrate Hierarchical Inheritance for Online Shopping
 */

package oopsdemo2;

public class RegisteredCustomer extends Customer {

    private  int customerId;
    private String[] cart;
    private int cartSize;

    public RegisteredCustomer(String name, String email,int customerId) {
        super(name, email);
        this.customerId=customerId; //Register Customer have id
        this.cart=new String[15]; //Register customer can add 15 items to cart
        this.cartSize=0;
    }

    public void displayCustomerInfo() {
        super.display();
        System.out.println("Customer ID: " + customerId);
    }

    public void addToCart(String item) {
        if (cartSize < cart.length) {
            cart[cartSize] = item;
            cartSize++;
            System.out.println(item + " added to cart.");
        } else {
            System.out.println("Cart is full. Cannot add more items.");
        }
    }

    public void displayCart() {
        System.out.println("Items in Cart:");
        for (int i = 0; i < cartSize; i++) {
            System.out.println(cart[i]);
        }
    }

}
