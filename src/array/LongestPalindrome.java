package array;

public class LongestPalindrome {

    // it will reverse the number
    public int reverse(int n){
        int num = 0;
        while(n>0){
            num = num*10 + n%10;
            n /= 10;
        }
        return num;
    }

    // it will check if number and its reverse is equal or not and then add it to the num [after comparing the previous value it had, then it add, so that num will contain the max value]
    public int find(int[] arr) {
        int num = -1;
        for (int i : arr){
            if(i == reverse(i))
                num = num > i ? num : i ;
        }
        return num;
    }

    public static void main(String[] args) {
        int[] arr = {1, 121, 555151, 54515245, 10111, 323};
        LongestPalindrome obj = new LongestPalindrome();
        int n = obj.find(arr);

        if(n!=-1)
            System.out.println(n);
    }
}
