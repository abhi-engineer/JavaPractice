package array;

public class SumOfAllElements {

    private static int sum(int[] arr){
        int sum = 0;
        for(int i : arr)
            sum += i;

        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 6, 1, 4};
        System.out.println(sum(arr));
    }
}
