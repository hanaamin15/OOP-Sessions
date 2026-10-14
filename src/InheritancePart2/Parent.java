package InheritancePart2;

public class Parent {

    //Attributes
    String studentName;
    int age;
    String schoolName;


    //Methods
    public void printStudentInfo() {
        System.out.println("Student Name : " + studentName);
        System.out.println("Student Age : " + age);
        System.out.println("School Name : " + schoolName);
    }

    //Default Constructor
    public Parent(){

    }

    //Parameterized constructor

    public Parent(String studentName, int age, String schoolName) {
        this.studentName = studentName;
        this.age = age;
        this.schoolName = schoolName;
    }
}
