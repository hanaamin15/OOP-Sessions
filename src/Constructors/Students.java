package Constructors;

public class Students {

    //Attributes
    String name;
    int age;
    int id;
    double gpa;
    static int counter = 0;





    //Method
    public void printInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Id: " + id);
        System.out.println("Gpa: " + gpa);
        System.out.println("number of object:"+counter);

    }
    public static void printnumberofobjects()
    {
        System.out.println("Number of objects: "+counter);
    }


    //Default constructor
    public Students()
    {
        counter++;

    }


    //Parameterized constructor
    public Students(String name, int age, int id, double gpa) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.gpa = gpa;
        counter++;
    }
}
