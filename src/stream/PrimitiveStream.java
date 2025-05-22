package stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PrimitiveStream {
    public static void main(String[] args) {
        // streams can be used with primitive values

        int[] arr = {2,4,5,1,1,4};
        IntStream stream = Arrays.stream(arr);
    }
}
