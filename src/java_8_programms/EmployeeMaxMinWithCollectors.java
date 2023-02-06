package java_8_programms;

import java_8_programms.model.Employee;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class EmployeeMaxMinWithCollectors {
    static List<Employee> employeeList
            = Arrays.asList(new Employee("Tom Jones", 45, 15000.00),
            new Employee("Tom Jones", 45, 7000.00),
            new Employee("Ethan Hardy", 65, 8000.00),
            new Employee("Nancy Smith", 22, 10000.00),
            new Employee("Deborah Sprightly", 29, 9000.00));

    public static void main(String[] args) {

        Optional<Employee> maxSalaryEmp =
                employeeList.stream()
                        .collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
        System.out.println("Employee with max salary:"
                + (maxSalaryEmp.isPresent()? maxSalaryEmp.get():"Not Applicable"));


        Optional<Employee> minAgeEmp =
                employeeList.stream()
                        .collect(Collectors.minBy(Comparator.comparing(Employee::getAge)));
        System.out.println("Employee with min age:"
                + (minAgeEmp.isPresent()? minAgeEmp.get():"Not Applicable"));
    }
}

