package oopsdemo2;


//Child class of Employee - Developer is a employee
public class Developer extends Employee
{

    private String technology;


    public Developer(int empId, String name, String dept,String technology) {
        super(empId, name, dept); // Invokes parent class constructor
        this.technology = technology;
    }

        public void print(){
            System.out.println("Technology Used by Developer : "+technology);
            System.out.println("*************************************************");
        }
    }

