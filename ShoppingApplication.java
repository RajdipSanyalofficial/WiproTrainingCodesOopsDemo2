/**
 * Single Inheritance for online shopping
 */

package oopsdemo2;

public class ShoppingApplication {
    public static void main(String[] args) {

        ShoppingCart cart1 = new ShoppingCart("Mary John","mary@wipro.com");

        System.out.println("***************** Online Shopping Portal ******************");
        cart1.addItem("Earbuds Variant 1");
        cart1.addItem("Earbuds Variant 2");
        cart1.addItem("Earbuds Variant 3");
        cart1.addItem("Earbuds Variant 4");

        System.out.println("Customer Details ");
        cart1.display();
        System.out.println("\tCart Details ");
        cart1.displayCart();
    }
}

