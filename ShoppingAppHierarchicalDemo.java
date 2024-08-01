package oopsdemo2;


    public class ShoppingAppHierarchicalDemo {
        public static void main(String[] args) {

            RegisteredCustomer registeredCustomer = new RegisteredCustomer("Karnam Balaji",
                    "balaji@wipro.com", 999);

            GuestCustomer guestCustomer = new GuestCustomer("Jane Smith", "jane@test.com");

            System.out.println("************* Stop Shop Shopping Portal *******************");

            System.out.println(" ------------ Registered Customer -------------------------");
            registeredCustomer.displayCustomerInfo();
            registeredCustomer.addToCart("Lenova Laptop");
            registeredCustomer.addToCart("Samsung S24 Cell Phone");
            registeredCustomer.addToCart("Intex Television");
            registeredCustomer.addToCart("HP Pen Drive");
            registeredCustomer.addToCart("Bose Speakers");
            System.out.println("---------------- Cart Details ----------------------------");
            registeredCustomer.displayCart();

            System.out.println();

            System.out.println(" ------------ Guest Customer -------------------------");
            guestCustomer.display();
            guestCustomer.addToCart("POCO F5 Cell Phone");
            guestCustomer.addToCart("DELL LED Monitor");
            guestCustomer.addToCart("Seagate HDD");
            guestCustomer.addToCart("Bajaj Micro Fan");
            guestCustomer.addToCart("Nippo cells");
            guestCustomer.addToCart("Ahuja Microphone");
            System.out.println("---------------- Cart Details ----------------------------");
            guestCustomer.displayCart();
        }
    }


