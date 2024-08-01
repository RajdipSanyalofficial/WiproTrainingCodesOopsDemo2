package oopsdemo2;


//Base class for Single inheritance
public class Employee {

    private int empId;
    private String name,dept;

    public Employee(int empId, String name, String dept) {
        this.empId = empId;
        this.name = name;
        this.dept = dept;
    }

    public void display(){
        System.out.println("************ Employee Details *************");
        System.out.println("Employee Id       :"+empId);
        System.out.println("Employee Name     :"+name);
        System.out.println("Department        :"+dept);
    }
}
