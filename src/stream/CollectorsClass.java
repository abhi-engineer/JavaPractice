package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsClass {
    public static void main(String[] args) {
        // collectors is a utility class
        // provides a set of methods to create common collectors

        List<Integer> list = Arrays.asList(1,4,6,6,2,3);
        // 1. collecting to list
        list.stream().collect(Collectors.toList());

        // 2. collecting as set
        list.stream().collect(Collectors.toSet());

        // 3. collecting as specific Collection
        list.stream().collect(Collectors.toCollection(() -> new ArrayList<>()));

        // 4. joining String : concatinate elements into a string
        List<String> list1 = Arrays.asList("Abhi","Developer","java","Australia","India");
        String concatinatedString = list1.stream().collect(Collectors.joining(" "));
        System.out.println(concatinatedString);
        
        // 5. groupingBy()
        Map<Integer, List<String>> group = list1.stream().collect(Collectors.groupingBy(x -> x.length()));  //it will group elements on the basis of length
        System.out.println(group);
        Map<Integer, Long> group1 = list1.stream().collect(Collectors.groupingBy(x -> x.length(), Collectors.counting()));
        System.out.println(group1);
        // jo hum groupingBy() me pass krenge, usi basis pe group bnyaga and map me return karega
        // iske kafi overriden methods hai. simple, group bnake uss group pe b operation perform kar skte hai.

        // 6. partioning : partition elements into 2 group true and false based on predicate
        System.out.println(list1.stream().collect(Collectors.partitioningBy(x -> x.length() == 4)));
        // isme b hum partiona ke baad , uspe operation perform kar skte hai, (downstream)

        // 7. mapping and collecting : applies a mapping before collecting
        System.out.println(list1.stream().collect(Collectors.mapping(x -> x.toUpperCase(),Collectors.toList())));

        // 8. toMap()
        Map<String, Integer> streamToMap = list1.stream().collect(Collectors.toMap(a -> a, a -> a.length()));
        System.out.println(streamToMap);
        // to prevent duplicateKeyException we have tell, how we merge values
        Map<Integer, String> streamToMap1 = list1.stream().collect(Collectors.toMap(a -> a.length(),s -> s , (a,b) -> a +","+b));
        System.out.println(streamToMap1);



    }
}
