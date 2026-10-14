package Inheritance;

public class Main {
    public static void main(String[] args) {
        FixedEmplyees ahmed = new FixedEmplyees();
        ahmed.id=123;
        ahmed.name="Ahmed";


        ahmed.salary=1000;
        ahmed.CalculateSalary();
        ahmed.printEmploeesInfo();

        HourlyEmployees samy = new HourlyEmployees();
        samy.id=542;
        samy.name="Samy";


        samy.hourlyRate=23.6;
        samy.hours=8;
        samy.CalculateSalary();
        samy.printEmploeesInfo();
    }
}
