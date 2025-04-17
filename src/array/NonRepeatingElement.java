package array;

import java.util.*;

public class NonRepeatingElement {

    public void findUnique(int[] arr){
        Set<Integer> set = new TreeSet<>();
        for (int i : arr){
            set.add(i);
        }
        for(int i : set)
            System.out.print(i+" ");
    }


    public static void main(String[] args) {
        int[] arr = {10, 30, 40, 20, 10, 20, 50, 10};
        NonRepeatingElement obj = new NonRepeatingElement();
        obj.findUnique(arr);
    }
}
