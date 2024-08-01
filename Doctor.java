/**
 * Java Program to demonstrate Hierarchical Inheritance for initializing & Display
 * different types of Doctors Information
 */

package oopsdemo2;

public class Doctor {

    private int idNumber;
    private String name,address;

    public Doctor(int idNumber,String name, String address) {
        this.idNumber=idNumber;
        this.name = name;
        this.address = address;
    }

    public void display() {
        System.out.println("******** Doctor Details ***********");
        System.out.println("The Doctor Id is   : "+idNumber);
        System.out.println("The Doctor Name is : "+name);
        System.out.println("The Doctor City is : "+address);
    }
}
