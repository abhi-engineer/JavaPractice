package array;

import java.util.Arrays;

public class BinarySearch {

    // Performs binary search on a sorted array
    private static int binarySearch(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            System.out.println("Empty or null array.");
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // Avoid potential overflow
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid; // Target found
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 6, 1, 4};

        // Sort array before applying binary search
        Arrays.sort(arr); // [1, 2, 3, 4, 5, 6]
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        int target = 1;
        int index = binarySearch(arr, target);

        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found.");
        }
    }
}

//Time Complexity of Binary Search
//
//Best case: O(1) → when the target is at the middle
//
//Worst case / Average case: O(log n) → because each step halves the search range
//
//Binary Search is very efficient for sorted arrays/lists.