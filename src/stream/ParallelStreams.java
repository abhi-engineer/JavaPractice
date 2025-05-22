package stream;

import java.util.List;
import java.util.stream.Stream;

public class ParallelStreams {

    private static long fact(int n){
        if(n == 0 || n ==1)
            return 1;

        int result = 1;
        for(int i=2; i<=n; i++)
            result *= i;

        return  result;
    }
    public static void main(String[] args) {
        // parallel performing multiple operations on the collection.
        // parallel stream are most effective for CPU intensive task or for large dataset , where task are INDEPENDENT
        // it may add overhead for simple task or for small dataset.
        // sequential() : used to convert parallel stream to single stream.

        // calculating time before starting the calculation
        long startTime = System.currentTimeMillis();
        // creating list of 1000 values from 1 to 1000
        List<Integer> list = Stream.iterate(1, i -> i + 1).limit(10000).toList();
        // performing factorial on the each number in the list using single stream
        List<Long> factorialList1 = list.stream().map(n -> fact(n)).toList();
        // calculating time after ending the calculation
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken with single stream : " + (endTime-startTime) +" ms");

        // calculating time before starting the calculation
        startTime = System.currentTimeMillis();
        // performing factorial on the each number in the list using parallel stream
        List<Long> factorialList2 = list.parallelStream().map(n -> fact(n)).toList();
        // calculating time after ending the calculation
        endTime = System.currentTimeMillis();
        System.out.println("Time taken with parallel stream : " + (endTime-startTime) +" ms");
//        factorialList.forEach(System.out::println);
    }
}
