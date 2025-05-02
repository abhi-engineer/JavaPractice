package numbers;
// Armstrong number is any number following the given rule
// abcd... = a^n + b^n + c^n + d^n + ...
// Where n is the order(length/digits in number)

// Example = 153 (order/length = 3)
// 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153

// Example = 1634 (order/length = 4)
// 1634 = 1^4 + 6^4 + 3^4 + 4^4 = 1 + 1296 + 81 + 256 = 1634

// number of digits in a number is order

public class Amstrong {

    public int calcNoOfDigit(int num){
        int noOfDigit = 0;
        while(num>0){
            noOfDigit++;
            num /= 10;
        }
            return noOfDigit;
    }

    public boolean check(int num){
        int n = num;
        int noOfDigit = calcNoOfDigit(n);
        int sum = 0;
        while (n>0){
            int lastDigit = n%10;
            int powOfLastDigit = (int) Math.pow(lastDigit, noOfDigit);
            sum += powOfLastDigit;
            n /= 10;
        }
        return sum==num;
    }

    public static void main(String[] args) {
        Amstrong obj = new Amstrong();
        System.out.println(obj.check(153));
    }
}
