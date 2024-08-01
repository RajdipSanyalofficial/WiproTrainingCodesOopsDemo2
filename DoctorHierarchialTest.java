package oopsdemo2;

public class DoctorHierarchialTest {

    public static void main(String[] args)
    {
        Specialist specialistDoctor=new Specialist(10001,"Mery King","Bengaluru");

        NonSpecialist  nonspecialistDoctor= new NonSpecialist(2001,"Gavin King","Melbourne");

        specialistDoctor.display();
        nonspecialistDoctor.display();
    }
}
