package exceptionHandling.customException;

import java.util.Scanner;

public class TestClass {

    public void askSalary(int salary) throws MyException {
        if(salary > 10000)
            throw new MyException("Budget is Low");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Whats your Exceptation ? ");
        try {
            new TestClass().askSalary(sc.nextInt());
        }
        catch (MyException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
