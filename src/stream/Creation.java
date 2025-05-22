package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Creation {
    public static void main(String[] args) {

        // 1 creating stream for collection
        List<Integer> list = Arrays.asList(1,2,4,5,3);
        Stream<Integer> stream = list.stream();

        // 2 creating stream for array
        String[] arr = {"abhi","Sharma","developer"};
        Stream<String> stream1 = Arrays.stream(arr);

        // 3 using stream.of()
        Stream<String> stream2 = Stream.of("a","b","c");

        // 4 infinite stream
        Stream<Integer> stream3 = Stream.generate(() -> 1).limit(100);
        // creating infinite stream which has 1
        // but with limit we can limit it

        Stream<Integer> stream4 = Stream.iterate(1,x -> x+1).limit(100);
        // creating stream, starting from 1 and after that do x+1 [add 1 in every new iteration]
    }
}
