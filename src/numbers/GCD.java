package numbers;

public class GCD {

    public int gcd(int num1, int num2){
        int min = num1 < num2 ? num1 : num2;
        while(min>1){
            if(num1%min==0 && num2%min==0)
                return min;
            min--;
        }
        return 1;
    }

    public static void main(String[] args) {
        GCD obj = new GCD();
        int gcd = obj.gcd(45,36);
        System.out.println(gcd);
    }
}
