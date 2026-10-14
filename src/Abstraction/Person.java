package Abstraction;

public abstract class Person {

    //Attributes

    int id;
    String name;

    //Method

    public void printEmploeesInfo()
        {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        }

        //Overriding
    public abstract void CalculateSalary();  //abstract





}
