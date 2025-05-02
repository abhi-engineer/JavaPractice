package numbers;

public class Factorial {

    public int fact(int n){
        if(n==1 || n==0)
            return 1;
        else return n * fact(n-1);
    }

    public static void main(String[] args) {
        Factorial obj = new Factorial();
        int res = obj.fact(5);
        System.out.println(res);
    }
}
