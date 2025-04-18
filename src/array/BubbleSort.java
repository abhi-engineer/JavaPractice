package array;

public class BubbleSort {

    public int[] sort(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5,6,3,2,1,4};
        BubbleSort obj = new BubbleSort();
        arr = obj.sort(arr);
        for(int i : arr)
            System.out.println(i);
    }
}
