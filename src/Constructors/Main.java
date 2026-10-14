package Constructors;

public class Main {
    public static void main(String[] args) {
        Students student1 = new Students("Ahmed",20,1234,3.7);
        student1.printInfo();
        Students student2 = new Students("Amina", 18,985,2.8);
        student2.printInfo();
        Students student3 = new Students("Adham", 15, 875,4);
        student3.printInfo();
        Students student4 = new Students("Gamila",21,676,3.7);
        student4.printInfo();

        Students.printnumberofobjects();




    }
}
