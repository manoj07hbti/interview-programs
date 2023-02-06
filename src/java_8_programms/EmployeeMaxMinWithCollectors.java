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
//TODO 1. find employee with max salary
        Optional<Employee> maxSalaryEmp =
                employeeList.stream()
                        .collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
        System.out.println("Employee with max salary:"
                + (maxSalaryEmp.isPresent()? maxSalaryEmp.get():"Not Applicable"));

//TODO here we have created stream from list of String using .stream()
//  and we have used Collectors.maxBy method to get the max salary by passing employee salary inside comparing method


//TODO 2. find employee with minimum age

        Optional<Employee> minAgeEmp =
                employeeList.stream()
                        .collect(Collectors.minBy(Comparator.comparing(Employee::getAge)));
//TODO here we have created stream from list of String using .stream()
//  and we have used Collectors.minBy method to get the min Age by passing employee salary inside comparing method


        System.out.println("Employee with min age:"
                + (minAgeEmp.isPresent()? minAgeEmp.get():"Not Applicable"));
    }
}

