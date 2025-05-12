package array;

public class InsertionSort {

    private int[] sort(int[] arr) {
        for (int i=0; i<arr.length; i++){
            int minIndex = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[minIndex])
                    minIndex = j;
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {5,6,3,2,1,4};
        InsertionSort obj = new InsertionSort();
        arr = obj.sort(arr);
        for(int i : arr)
            System.out.println(i);
    }
}
