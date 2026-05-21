package java_prct;

interface PaymentStrategy {
    double calculatePayment();
}

class FixedSalary implements PaymentStrategy {
    public final double baseSalary;

    public FixedSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculatePayment() {
        return this.baseSalary;
    }
}

class SalaryWithBonus implements PaymentStrategy {
    public final double baseSalary;
    public final double bonus;

    public SalaryWithBonus(double baseSalary, double bonus) {
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculatePayment() {
        return this.baseSalary + this.bonus;
    }
}

class HourlyWage implements PaymentStrategy {
    public final double hourlyRate;
    public final double hoursWorked;

    public HourlyWage(double hourlyRate, double hoursWorked) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePayment() {
        return this.hourlyRate * this.hoursWorked;
    }
}

class Employee {
    public final String name;
    public final PaymentStrategy paymentMethod;

    public Employee(String name, PaymentStrategy paymentMethod) {
        this.name = name;
        this.paymentMethod = paymentMethod;
    }

    public double calculatePayment() {
        return this.paymentMethod.calculatePayment();
    }

    public String getDetails() {
        return "Employee Name: " + this.name + ", Payment: " + this.calculatePayment();
    }

}

public class OOPInheritance {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", new FixedSalary(50000));
        Employee emp2 = new Employee("Bob", new SalaryWithBonus(40000, 10000));
        Employee emp3 = new Employee("Charlie", new HourlyWage(20, 160));

        System.out.println(emp1.getDetails());
        System.out.println(emp2.getDetails());
        System.out.println(emp3.getDetails());

        emp1 = new Employee("Alice", new SalaryWithBonus(50000, 5000));
        System.out.println(emp1.getDetails());
    }
}