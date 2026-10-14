package InheritancePart2;

public class Main {
    public static void main(String[] args) {
        MathSubject mathSubject = new MathSubject();
        mathSubject.studentName="Anwar";
        mathSubject.age=20;
        mathSubject.schoolName="nis";
        mathSubject.printStudentInfo();


        PhysicsSubject physicsSubject = new PhysicsSubject("Samira",21,"Maaly");
        physicsSubject.printStudentInfo();


    }
}
