package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperation {

    public static void main(String[] args) {
        // intermediate operation transform one stream to another stream
        // They are lazy , meaning :  don't execute until a terminal operation is performed

        List<String> list = Arrays.asList("Abhi","Developer","Chandigarh","Europe","Abhi");

        // 1. filter() : used to filter data by performing a operation.
        List<String> a = list.stream().filter(x -> x.startsWith("A")).toList();
        System.out.println(a);

        // 2. map() : used to perform a operation on all elements of collection
        list.stream().map(String::toUpperCase).forEach(System.out::println);

        // 3. sorted() : used to sort stream
        Stream<String> sorted = list.stream().sorted();
        Stream<String> sortedWithComparator = list.stream().sorted((o1, o2) -> o1.length() - o2.length());

        // 4. distinct()
        list.stream().distinct().forEach(System.out::println);

        // 5. limit()

        // 6. skip() :: it will skip 10 values
        Stream.iterate(1,x -> x+1).skip(10).limit(100);

        // 7. peek() : used to perform operation on each element as it is consumed
        // forEach is terminal operation.
        // used for Debugging, logging during pipeline
        // Does not modify elements
        long count = list.stream().filter(x -> x.length() == 4).peek(System.out::print).count();
        System.out.println(count);


    }
}
