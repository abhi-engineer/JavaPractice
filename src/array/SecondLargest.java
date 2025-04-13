package array;

public class SecondLargest {

    public int find(int[] arr){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        return  secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {4,6,13,1,9,8};
        SecondLargest obj = new SecondLargest();
        int num = obj.find(arr);
        System.out.println(num);
    }
}
