/**
 * Single Inheritance for online shopping
 */


package oopsdemo2;

//Child class of customer for managing cart
public class ShoppingCart extends Customer{

    private String[] items;
    private int itemCount;

    public ShoppingCart(String name, String email) {
        super(name, email);
        items = new String[10];
        itemCount = 0;
    }

    public void addItem(String item){
        if(itemCount < items.length){
            items[itemCount]=item;
            itemCount++;
            System.out.println(item+" Added to Cart");
        }else {
            System.out.println("Cart is Full. Cannot Add More Items.");
        }
    }

    public void displayCart(){
        System.out.println("Items in Cart: ");
        for (int i = 0; i < itemCount; i++) {
            System.out.println(items[i]);
        }
    }
}
