package Question3;
import java.util.Arrays;
import java.util.Comparator;

class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', salary=" + salary + '}';
    }
}

public class SortEmployees {
    public static void sortEmployeesBySalary(Employee[] employees) {
        Arrays.sort(employees, Comparator.comparingInt(emp -> emp.salary));
    }

    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("Sumit", 50000),
            new Employee("Dinesh", 60000),
            new Employee("Vidya", 40000)
        };
        sortEmployeesBySalary(employees);
        System.out.println("Employees sorted by salary: ");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
