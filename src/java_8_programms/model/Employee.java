package java_8_programms.model;

import java.text.DecimalFormat;
public class Employee {
    private String name;
    private Integer age;
    private Double salary;

    public Employee(String name, Integer age, Double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    //Getters and Setters of name, age & salary go here

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String toString(){
        DecimalFormat dformat = new DecimalFormat(".##");
        return "Employee Name:"+this.name
                + "  Age:"+this.age
                + "  Salary:"+dformat.format(this.salary);
    }
    //Standard equals() and hashcode() implementations go here

}