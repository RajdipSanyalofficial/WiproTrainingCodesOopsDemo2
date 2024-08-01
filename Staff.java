/**
 * Program to demonstrate MultiLevel Inheritance to Calculate Salary Structure of
 * different levels of Employees
 */

package oopsdemo2;

//class Staff with Id , name and Salary
public class Staff {

    private int staffId;
    private String name;
    protected float salary, hra; // protected variables can be accessed in Child class

    public Staff(int staffId, String name, float salary) {
        this.staffId = staffId;
        this.name = name;
        this.salary = salary;
    }

    void getHRA() {
        hra = (salary * 60) / 100;
        System.out.println("HRA: " + hra);
    }

    void display() {
        System.out.println(staffId + " " + name + " " + salary);
    }

    void printSal() {
        System.out.println("Total Salary: " + (salary + hra));
    }
}

class Manager extends Staff {

    protected float da;
    private float gross;

    public Manager(int staffId, String name, float salary) {
        super(staffId, name, salary);
    }

    void getDA() {
        da = (salary * 60) / 100;
        System.out.println("Dearness Allowance: " + da);
    }

    void print() {
        gross = salary + hra + da;
        System.out.println("Total Salary of Manager: " + gross);
    }
}

class Director extends Manager {

    private float ta, gross;

    public Director(int staffId, String name, float salary) {
        super(staffId, name, salary);
    }

    void getTA() {
        ta = (salary * 30) / 100;
        System.out.println("Travelling Allowance: " + ta);
    }

    @Override
    void print() {
        gross = salary + hra + da + ta;
        System.out.println("Total Salary of Director: " + gross);
    }
}

