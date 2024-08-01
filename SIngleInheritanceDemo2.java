package oopsdemo2;



    public class SIngleInheritanceDemo2 {
        public static void main(String[] args) {

            Developer d1 = new Developer(1001,"James Gosling","Technical","JDBC");
            Developer d2 = new Developer(1002,"Rod Johnson","IT","Springboot");

            d1.display();
            d1.print();
            d2.display();
            d2.print();

            Employee e1 = new Employee(999,"Mary Smith","HR");
            Employee e2 = new Employee(888,"Navin Kumar","Sales");

            e1.display();
            System.out.println();
            e2.display();

        }
    }
