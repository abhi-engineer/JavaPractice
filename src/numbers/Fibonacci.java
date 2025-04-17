package numbers;

public class Fibonacci {

    public void fibonacci(int num){
        int a = -1;
        int b = 1;
        while(num>0){
            int sum = a + b;
            System.out.print(sum + " ");
            a = b;
            b = sum;
            num--;
        }
    }

    public static void main(String[] args) {
        Fibonacci obj = new Fibonacci();
        obj.fibonacci(10);
    }
}
