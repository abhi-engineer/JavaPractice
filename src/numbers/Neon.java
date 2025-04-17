package numbers;
//9² = 81
//8+1 = 9;
public class Neon {

    public boolean isNeon(int num) {
        int square = num * num;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return num == sum;
    }

    public static void main(String[] args) {
        Neon obj = new Neon();
        System.out.println(obj.isNeon(9)); // true
    }
}
