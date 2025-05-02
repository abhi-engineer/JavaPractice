*/
======================================
 Sorting a List (Integers and Strings)
 ======================================

import java.util.*;
import java.util.stream.*;

public class ListSortDemo {

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(5, 2, 9, 1, 3);

        List<Integer> intAsc = intList.stream()
                                      .sorted()
                                      .collect(Collectors.toList());

        List<Integer> intDesc = intList.stream()
                                       .sorted(Comparator.reverseOrder())
                                       .collect(Collectors.toList());

        System.out.println("Integer List Ascending: " + intAsc);
        System.out.println("Integer List Descending: " + intDesc);
    }
}

/
===================================================
Sorting a List of Custom Objects Using Java Streams
===================================================

import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }

    // toString for easy printing
    public String toString() {
        return id + " - " + name + " - ₹" + salary;
    }
}

public class CustomObjectListSort {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
            new Employee(101, "Alice", 50000),
            new Employee(102, "Bob", 60000),
            new Employee(103, "Charlie", 40000),
            new Employee(104, "David", 60000)
        );

        // Sort by salary (ascending)
        List<Employee> salaryAsc = employees.stream()
            .sorted(Comparator.comparing(Employee::getSalary))
            .collect(Collectors.toList());

        // Sort by salary (descending)
        List<Employee> salaryDesc = employees.stream()
            .sorted(Comparator.comparing(Employee::getSalary).reversed())
            .collect(Collectors.toList());

        // Sort by name (alphabetical)
        List<Employee> nameAsc = employees.stream()
            .sorted(Comparator.comparing(Employee::getName))
            .collect(Collectors.toList());

        // Sort by salary, then by name
        List<Employee> salaryThenName = employees.stream()
            .sorted(Comparator.comparing(Employee::getSalary)
                              .thenComparing(Employee::getName))
            .collect(Collectors.toList());

        // Print results
        System.out.println("Sorted by Salary (Asc):");
        salaryAsc.forEach(System.out::println);

        System.out.println("\nSorted by Salary (Desc):");
        salaryDesc.forEach(System.out::println);

        System.out.println("\nSorted by Name:");
        nameAsc.forEach(System.out::println);

        System.out.println("\nSorted by Salary then Name:");
        salaryThenName.forEach(System.out::println);
    }
}

/
====================================================================
we can sort set,queue, by converting it into list like below example
=====================================================================

Queue<Integer> queue = new PriorityQueue<>(Arrays.asList(5, 2, 9, 1, 3));

        //Sort the Queue (Ascending order
        List<Integer> sortedQueue = queue.stream()
                                         .sorted()
                                         .collect(Collectors.toList());