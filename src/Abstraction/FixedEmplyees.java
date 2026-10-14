package Abstraction;

import Inheritance.Person;

public class FixedEmplyees extends Person implements Sample {

    //Attributes

    int salary;

    @Override
    public void CalculateSalary() {
        System.out.println("Net salary is: "+salary);
    }

    @Override
    public void subtract() {

    }
}
