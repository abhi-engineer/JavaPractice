package employeManagerConsoleApp.service;

import employeManagerConsoleApp.entity.Employee;

import java.util.ArrayList;
import java.util.List;

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
//        employeeList.stream()..sorted();
    }

    public void filterByService() {
        
    }

    public void groupByDept() {
    }

    // other methods like filter, delete, etc.
}