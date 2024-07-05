package Inheritense;

public class Child extends Parent{
    String qualifications;
    void displayInfo2()
    {
        displayInfo1();
        System.out.println("Qualifications: "+ qualifications);
    }
}
