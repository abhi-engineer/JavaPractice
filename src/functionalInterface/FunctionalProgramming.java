package functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionalProgramming {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jhony",1,"Developer"));
        employeeList.add(new Employee("Bheem",2,"Testing"));
        employeeList.add(new Employee("Popayee",3,"Devops"));

        Function<Employee,String> update = (employee) -> employee.getDesignation().concat(" Astinil");
        employeeList.stream().map(update).forEach(System.out::println);

        employeeList.stream().filter(employee -> employee
                .getName()
                .equals("Jhony"))
                .forEach(System.out::println);
    }
}
