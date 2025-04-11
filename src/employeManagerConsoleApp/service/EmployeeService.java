package employeManagerConsoleApp.service;

import employeManagerConsoleApp.entity.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeService {

    private List<Employee> employeeList = new ArrayList<>();

    public EmployeeService() {
        employeeList.add(new Employee(101, "Abreen", "IT", 60000, "abreen@mail.com", "9999999999"));
        employeeList.add(new Employee(102, "John", "HR", 50000, "john@mail.com", "8888888888"));
        employeeList.add(new Employee(103, "Alice", "IT", 70000, "alice@mail.com", "7777777777"));
        employeeList.add(new Employee(104, "Bob", "Finance", 45000, "bob@mail.com", "6666666666"));
    }

    public List<Employee> getAllEmployees() {
        return employeeList;
    }

    public String addEmployee(Employee emp){
        return "employee added";
    }

    public void viewAll() {
        employeeList.forEach(System.out::println);
    }

    public Employee searchById(int id) {
        for(Employee emp : employeeList){
            if(emp.getId() == id)
                return emp;
        }
        return null;
    }

    public boolean deleteById(int id) {
        for(Employee emp : employeeList){
            if(emp.getId() == id){
                return employeeList.remove(emp);
            }
        }
        return false;
    }

    public void sortBySalary() {
        employeeList.stream()
                .sorted((e1, e2) -> Float.compare(e1.getSalary(), e2.getSalary()))
                .forEach(System.out::println);
    }



    public void filterBySalary(float salary) {
        employeeList.stream()
                .filter((e) -> e.getSalary() == salary)
                .forEach(System.out::println);
    }

    public void groupByDept(String dept) {
        Map<String , List<Employee>> map =  employeeList.stream()
                .collect(Collectors.groupingBy(e -> e.getDept()));

        map.forEach((dep, emp) -> {
            System.out.print(dep + " : ");
            emp.forEach(e -> System.out.print(e.getName() + " "));
            System.out.println();
        });
    }

}