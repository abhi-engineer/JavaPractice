package array;

public class AverageOfAllElements {
    private static float avg(int[] arr){
        int sum = 0;
        for(int i : arr)
            sum += i;

        return (float) sum /arr.length;
    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 6, 1, 4};
        System.out.println(avg(arr));
    }
}
