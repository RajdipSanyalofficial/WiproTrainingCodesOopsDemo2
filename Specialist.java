/**
 * Java Program to demonstrate Hierarchical Inheritance for initializing & Display
 *  * different types of Doctors Information
 */


package oopsdemo2;

public class Specialist extends Doctor{

    private String speciality;

    public Specialist(int idNumber, String name, String address) {
        super(idNumber, name, address);
        this.speciality=speciality;
    }

    public void display() {
        super.display();
        System.out.println("The Speciality is : "+speciality);
    }
}
