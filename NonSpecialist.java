/**
 * Java Program to demonstrate Hierarchical Inheritance for initializing & Display
 *  *  * different types of Doctors Information
 */

package oopsdemo2;

public class NonSpecialist extends Doctor {


    public NonSpecialist(int idNumber, String name, String address) {
        super(idNumber, name, address);
    }
}
