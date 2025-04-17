package numbers;

public class Reverse {

    public int reverse(int num){
        int n = 0;
        while(num>0){
            int temp = num%10;
            n = n*10+temp;
            num /=10;
        }
        return n;
    }

    public static void main(String[] args) {
        Reverse obj = new Reverse();
        int n = obj.reverse(12345);
        System.out.println(n);
    }
}
