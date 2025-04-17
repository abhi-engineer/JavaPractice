package array;

import java.util.Arrays;

public class ReplaceWithRank {

    public static void main(String[] args) {
        int[] arr = { 100, 2, 70, 12 , 90};
        int[] temp = arr.clone(); // temp array leke, usme clone dal dia
        Arrays.sort(temp);   // temp array sort krli

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<temp.length; j++){
                if(arr[i] == temp[j]) { // comparing the elements
                    arr[i] = j+1; // index 0 se start hote hai, and rank 1 se ,  isliye rank bnane ke +1 kardia
                    break;
                }
            }
        }
        for (int i : arr)
            System.out.println(i);
    }
}

// temp array leke , usme sort krke daal di
// us sort array ke sath orignal array ke elements compare krte gye
// yaha yaha element equal aye waha us orignal array me us element ki jagah uska index daal dia dusri array me yaha bo element hoga, sorted way me
