package numbers;

public class DivideTwoIntegers {

    public static int divide(int dividend, int divisor) {
        // Step 1: Handle overflow (edge case)
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Step 2: Determine sign
        boolean negative = (dividend < 0) ^ (divisor < 0);

        // Step 3: Work with long to avoid overflow and convert to positive
        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);
        int result = 0;

        // Step 4: Subtract the divisor using bit shifts
        while (dvd >= dvs) {
            long temp = dvs;
            int multiple = 1;

            while (dvd >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }

            dvd -= temp;
            result += multiple;
        }

        return negative ? -result : result;
    }

    public static void main(String[] args) {
        int divisor = 3;
        int dividend = 10;
        System.out.println(divide(dividend, divisor));
    }
}

/*
What happens when you try to negate Integer.MIN_VALUE?
    Integer.MIN_VALUE = -2,147,483,648
    If you do -Integer.MIN_VALUE, mathematically it should be 2,147,483,648.
    But 2,147,483,648 is outside the positive int range (max is 2,147,483,647).
    So, negating Integer.MIN_VALUE causes overflow.
 */
