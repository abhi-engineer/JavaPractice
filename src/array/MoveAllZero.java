package array;
// Move all zero to end while maintaining the order of other element

public class MoveAllZero {

    public int[] moveAllzero(int[] arr){
        int index = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0)
                arr[index++] = arr[i];
        }
        while(index < arr.length)
            arr[index++] = 0;

        return arr;
    }



    public static void main(String[] args) {
        int[] arr = {0,0,0,3,0,0};
        MoveAllZero obj = new MoveAllZero();
        arr = obj.moveAllzero(arr);
        for(int i: arr)
            System.out.print(i+" ");
    }
}
