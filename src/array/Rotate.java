package array;

public class Rotate {
// rotate on right ( last element temp variable me rakh lenge,right shift krenge and last me 1st index pe dal denge
// rotate on left ( 1st element temp variable me rakh lenge, left shift krenge, and last me last index pe dal denge

    public int[] rotate(int[] arr, int n){
        for(int i=0; i<n; i++){
            int temp = arr[arr.length-1];
            for(int j=arr.length-1; j>0; j--){
                arr[j] = arr[j-1];
            }
            arr[0] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        Rotate obj = new Rotate();
        arr = obj.rotate(arr,2);    // rotate on right side
        for(int i : arr)
            System.out.print(i+" ");

    }


}
