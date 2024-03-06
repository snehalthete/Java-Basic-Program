package labtask;


import labtask.Employee123;
import labtask.Manager1;
import labtask.Programmer;

abstract class Employee123{
String name;
int employeeId;

public Employee123(String name, int employeeId) {
    this.name = name;
    this.employeeId = employeeId;
}

public abstract double calculateSalary();
}

class Manager1 extends Employee123 {
double baseSalary;
double bonus;

public Manager1(String name, int employeeId, double baseSalary, double bonus) {
    super(name, employeeId);
    this.baseSalary = baseSalary;
    this.bonus = bonus;
}

@Override
public double calculateSalary() {
    return baseSalary + bonus;
}
}

class Programmer extends Employee123 {
double hourlyRate;
int hoursWorked;

public Programmer(String name, int employeeId, double hourlyRate, int hoursWorked) {
    super(name, employeeId);
    this.hourlyRate = hourlyRate;
    this.hoursWorked = hoursWorked;
}

@Override
public double calculateSalary() {
    return hourlyRate * hoursWorked;
}


public class Employee
{
public static void main(String[] args) {
    // Example usage
    Manager1 manager = new Manager1("John Doe", 101, 5000.0, 1000.0);
    Programmer programmer = new Programmer("Alice Smith", 102, 25.0, 40);

    System.out.println("Manager's Salary: $" + manager.calculateSalary());
    System.out.println("Programmer's Salary: $" + programmer.calculateSalary());
   }
  } 
}



