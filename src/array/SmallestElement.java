package array;

import java.util.Arrays;

public class SmallestElement {

//    public static int find(int[] arr){
//        Arrays.sort(arr);
//        return arr[0];
//    }

    public static int find(int[] arr){
        int element = arr[0];
        for(int i=1; i<arr.length; i++){
            if(element > arr[i])
                element = arr[i];
        }
        return element;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,5,1,4};
        System.out.println(find(arr));
    }
}
