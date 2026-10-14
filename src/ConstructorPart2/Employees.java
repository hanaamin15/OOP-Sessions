package ConstructorPart2;

public class Employees {

    //Attributes
    String name;
    String jobTitle;
    int salary;
    static int counter=0;


    //Method
    public void printInfo(){
        System.out.println("Name: "+name);
        System.out.println("Job Title: "+jobTitle);
        System.out.println("Salary: "+salary);
        System.out.println("Number of Employees: "+counter);
    }
    public static void printnumberofobjects(){
        System.out.println("Number of Employees: "+counter);
    }


    //Default constructor
    public Employees()
    {
        counter++;

    }



    //Parameterized constructor
    public Employees(String name, String jobTitle, int salary)
    {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
        counter++;
    }
}
