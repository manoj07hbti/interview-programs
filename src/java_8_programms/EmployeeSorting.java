package java_8_programms;

import java_8_programms.model.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSorting {


    public static void main(String[] args) {

        List<Employee> employeeList
                = Arrays.asList(new Employee("Rahul", 45, 15000.00),
                new Employee("Mukesh", 45, 7000.00),
                new Employee("Jatin", 65, 8000.00),
                new Employee("Aman", 22, 10000.00),
                new Employee("Zuber", 29, 9000.00));

//TODO Sort Employee based on Salary with ascending Order


        List<Employee> SortedEmployeesOnSalary =
                employeeList.stream()
                        .sorted(Comparator.comparingDouble(Employee::getSalary))
                        .collect(Collectors.toList());

//TODO here we have created stream from list of String using .stream()
// and we have used sorted method to sort the employee list and in sorted we are using comparator Comparator.comparingDouble
// based on salary so it will apply sorting on the basis of salary
// and here we are collecting output as a List so we are using Collectors.ToList() inside collect
        System.out.println("Employee based on Salary with ascending Order : "+SortedEmployeesOnSalary);


//TODO Sort Employee based on Salary with descending Order
        List<Employee> reverseSortedEmployeesOnSalary =
                         employeeList.stream()
                                     .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                                     .collect(Collectors.toList());
//TODO here we have created stream from list of String using .stream()
// and we have used sorted method to sort the employee list and in sorted we are using comparator Comparator.comparingDouble
// based on salary so it will apply sorting on the basis of salary and we have used reversed() for reverse order
// and here we are collecting output as a List so we are using Collectors.ToList() inside collect

        System.out.println("Employee based on Salary with descending Order : "+reverseSortedEmployeesOnSalary);


//TODO sort employee based on names

        List<Employee> sortedEmployeesbyName = employeeList.stream()
                .sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
                .collect(Collectors.toList());
//TODO here we have created stream from list of String using .stream()
//  and we have used sorted method to sort the employee list and we have passes lambda expression which is comparing names
// so that we can get sorting base on name using compare to method
// and here we are collecting output as a List so we are using Collectors.ToList() inside collect

        System.out.println("Sorted employee based on names "+sortedEmployeesbyName);

//TODO sort employee based on names and Salary

        Comparator<Employee> sortByName = (e1, e2) ->  e1.getName().compareToIgnoreCase(e2.getName());
// TODO here we have created name comparator to sort employee object by name
        Comparator<Employee> sortBySalary = (e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary());
// TODO here we have created salary comparator to sort employee based on salary
        //Sort by Name then Sort by Salary
        employeeList.stream().sorted(sortByName.thenComparing(sortBySalary)).forEach(e->System.out.println("sort employee based on names and Salary"+e));
// TODO here we are using both comparator with sorted method to apply both comparator based on name and salary

    }




}
