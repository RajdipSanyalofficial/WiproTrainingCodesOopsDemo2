
/**
 * Program to demonstrate MultiLevel Inheritance to Calculate Salary Structure of
 * different levels of Employees
 */


package oopsdemo2;

public class MultilevelDemo {
    public static void main(String[] args) {

        Director d1=new Director(101,"Keane Reaves",5000); //invokes director constructor
        System.out.println("******************* Director Salary Details ******************");
        //totalsal = basic+hra +da+ta
        d1.display(); // Staff class
        d1.getHRA(); //Staff
        d1.getDA(); //Manager class
        d1.getTA(); //Director
        d1.print(); // Director

        Manager m1=new Manager(102,"Mary John",4000);
        System.out.println("******************* Manager Salary Details ******************");
        //totalsal = basic+hra+da
        m1.display(); // Staff class
        m1.getHRA(); //Staff
        m1.getDA(); //Manager class
        m1.print(); // Manager class

        Staff s1=new Staff(103,"Helen Mark",2000);
        System.out.println("******************* Staff Salary Details ******************");
        //totalsal = basic + hra
        s1.display(); //Staff class
        s1.getHRA();//Staff class
        s1.printSal();//Staff class
    }
}
