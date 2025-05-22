package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOperation {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        //1. collect() : used to collect stream as collection (list,set,map etc.)
        List<Integer> collect = list.stream().map(x -> x * 2).collect(Collectors.toList());
        System.out.println(collect);

        // 2. forEach()
        list.forEach(System.out::println);

        // 3. reduce() : used to reduce a full collection into a single value
        Optional<Integer> reduce = list.stream().reduce((x, y) -> x + y);
        System.out.println(reduce.get());

        // 4. count() : count the value of the provided stream
        long count = list.stream().count();
        System.out.println(count);

        // 5. anyMatch(), allMatch(), noneMatch()
        boolean b = list.stream().anyMatch(x -> x % 2 == 0);    // if any matches, it returns true
        boolean b1 = list.stream().allMatch(x -> x % 2 == 0);   // if all matches,it returns true
        boolean b2 = list.stream().noneMatch(x -> x % 2 == 0);  // if none match, it returns true;

        // 6. findFirst(), findAny()
        Integer i = list.stream().findFirst().get();    // find and returns the first value
        Integer i1 = list.stream().findAny().get();     // find and returns the any specified value

        // 7. toArray() : converts colleciton to array
        Object[] arr = list.stream().toArray();

        // 8. max(), min()
        List<Integer> list1 = Arrays.asList(1,2,5,6,7,3);
        Optional<Integer> max = list1.stream().max((o1,o2) -> o1-o2);
        System.out.println("max val : "+ max.get());
        Optional<Integer> min = list1.stream().min(Comparator.naturalOrder());
        System.out.println("min val : "+ min.get());

        // 9. flatMap() : Handle streams of collections, list or arrays where each element is itself a colleciton
        // Flatten nested structure ( eg. list within list)
        // Transform and flatten elements at same time
        List<List<String>> list2 = Arrays.asList(
                Arrays.asList("Apple","Guava"),
                Arrays.asList("Grappes","Kivi"),
                Arrays.asList("Banyana","PineApple")
        );
        List<String> list3 = list2.stream().flatMap(fruitList -> fruitList.stream().map(fruit -> fruit.concat(" khao"))).map(x -> x.concat(" piyo")).toList();
        System.out.println(list3);

        // 10. forEachOrdered : used with parallel streams in order to traverse them orderwise
        list.parallelStream().forEach(System.out::print);
        System.out.println();
        list.parallelStream().forEachOrdered(System.out::print);
    }
}
