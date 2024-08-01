package oopsdemo2;


class Animal
{
    String name;

    Animal(String name)
    {
        this.name=name;
    }

    void eat()
    {
        System.out.println("I can Eat");
    }

    void display()
    {
        System.out.println("My name is :"+name); //using Parent class property in child
    }
}


//extends is a keyword used for Inheritance
class Dog extends Animal{


    // Constructors are not inherited
    Dog(String name) {
        super(name); //Invokes Parents class constructor for initializing name
    }

    void action()
    {
        System.out.println("I can Bark");
    }
}




public class SingleInheritenceDemo1 {

    public static void main(String[] args)
    {
        //Create Child class Object
        Dog d1=new Dog("Zimba"); //Invokes Child class constructor

        d1.display(); //Invoke child class method
        d1.eat();     //Invoke base class method
        d1.action();  //Invoke child class



        Dog d2=new Dog("Milo");

        d2.display(); //Invoke child class method
        d2.eat();     //Invoke base class method
        d2.action();  //Invoke child class
    }
}
