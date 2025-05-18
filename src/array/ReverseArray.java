package array;

public class ReverseArray {

    private static int[] reverse(int[] arr){
        for(int i=0; i<arr.length/2; i++){
            int temp = arr[arr.length-1-i];
            arr[arr.length-1-i] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 6, 1, 4};
        arr = reverse(arr);
        for (int i : arr)
            System.out.print(i + " ");
    }
}
