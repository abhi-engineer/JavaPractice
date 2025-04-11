package employeManagerConsoleApp;

import employeManagerConsoleApp.entity.Employee;
import employeManagerConsoleApp.service.EmployeeService;

import java.util.Scanner;

public class EmployerManagerConsoleApp {


    public static void main(String[] args) {

        EmployeeService employeeService = new EmployeeService();

        Scanner input = new Scanner(System.in);
        System.out.println("1.Add Employee ");
        System.out.println("2.View All ");
        System.out.println("3.Search by Id ");
        System.out.println("4.Delete by Id ");
        System.out.println("5.Sort by salary ");
        System.out.println("6.Filter by salary ");
        System.out.println("7.Group by Department ");
        System.out.println("8.Exit ");


        System.out.println("\nEnter your choice : ");
        int n = input.nextInt();


        switch (n){
            case 1:
                employeeService.addEmployee(new Employee());
            case 2 :
                employeeService.viewAll();
            case 3:
                Employee emp = employeeService.searchById(101);
                System.out.println(emp);
            case 4:
                System.out.println(employeeService.deleteById(101));
            case 5:
                employeeService.sortBySalary();
            case 6:
                employeeService.filterBySalary(60000);
            case 7:
                employeeService.groupByDept("IT");
            case 8:
                System.exit(0);
        }


    }

}
