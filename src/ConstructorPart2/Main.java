package ConstructorPart2;

public class Main {
    public static void main(String[] args) {
        Employees e1 = new Employees("Asser","HR",2000);
        e1.printInfo();
        Employees e2 = new Employees("Fatma","QA",10000);
        e2.printInfo();
        Employees e3 = new Employees("Samy","Frontend",20000);
        e3.printInfo();
        Employees e4 = new Employees("Hana","CEO",100000);
        e4.printInfo();
        Employees e5 = new Employees("Aya","IOS",30000);
        e5.printInfo();

       Employees.printnumberofobjects();

    }
}
