package Inheritance;

public class FixedEmplyees extends Person {

    //Attributes

    public int salary;

    @Override
    public void CalculateSalary() {
        System.out.println("Net salary is: "+salary);
    }
}
