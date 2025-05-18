package array;

public class FindMissingNumberInRange1ToN {

    private static int find(int[] arr){
        int n = arr.length+1;
        int actualResult = ( n * (n+1) )/2; // sum of natural number upto n
        int orignalResult = 0;
        for(int i=0; i<arr.length; i++){
            orignalResult += arr[i];
        }
        return actualResult - orignalResult;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,6,2,5,3,8};
        System.out.println(find(arr));
    }
}
