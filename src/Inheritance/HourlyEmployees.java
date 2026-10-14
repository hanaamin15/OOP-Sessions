package Inheritance;

import ConstructorPart2.Employees;

public class HourlyEmployees extends Person {
    public int id;
    public double hourlyRate;
    public int hours;

    @Override
    public void CalculateSalary() {
        System.out.println("Net salary:"+hourlyRate*hours);
    }
}
