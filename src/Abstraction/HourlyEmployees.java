package Abstraction;

import Inheritance.Person;

public class HourlyEmployees extends Person {
    double hourlyRate;
    int hours;

    @Override
    public void CalculateSalary() {
        System.out.println("Net salary:"+hourlyRate*hours);
    }
}
