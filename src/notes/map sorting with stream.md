/
===========================
Sorting a Map by Keys
=============================
import java.util.*;
import java.util.stream.*;

public class MapSortByKey {
public static void main(String[] args) {

        // Create a Map with Integer keys and String values
        Map<Integer, String> map = new HashMap<>();
        map.put(3, "Three");
        map.put(1, "One");
        map.put(4, "Four");
        map.put(2, "Two");

        // Sort the Map by keys (ascending order)
        Map<Integer, String> sortedByKey = map.entrySet()
                                              .stream()
                                              .sorted(Map.Entry.comparingByKey())
                                              .collect(Collectors.toMap(
                                                  Map.Entry::getKey,
                                                  Map.Entry::getValue,
                                                  (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println("Map sorted by Keys:");
        sortedByKey.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}

/
=========================
``Sorting a Map by Values
=========================

import java.util.*;
import java.util.stream.*;

public class MapSortByValue {
    public static void main(String[] args) {

        // Create a Map with Integer keys and String values
        Map<Integer, String> map = new HashMap<>();
        map.put(3, "Three");
        map.put(1, "One");
        map.put(4, "Four");
        map.put(2, "Two");

        // Sort the Map by values (ascending order)
        Map<Integer, String> sortedByValue = map.entrySet()
                                                .stream()
                                                .sorted(Map.Entry.comparingByValue())
                                                .collect(Collectors.toMap(
                                                    Map.Entry::getKey,
                                                    Map.Entry::getValue,
                                                    (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println("Map sorted by Values:");
        sortedByValue.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}

/
=============================================
Sorting a Map by Values in Descending Order
=============================================

import java.util.*;
import java.util.stream.*;

public class MapSortByValueDesc {
    public static void main(String[] args) {

        // Create a Map with Integer keys and String values
        Map<Integer, String> map = new HashMap<>();
        map.put(3, "Three");
        map.put(1, "One");
        map.put(4, "Four");
        map.put(2, "Two");

        // Sort the Map by values (descending order)
        Map<Integer, String> sortedByValueDesc = map.entrySet()
                                                    .stream()
                                                    .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                                                    .collect(Collectors.toMap(
                                                        Map.Entry::getKey,
                                                        Map.Entry::getValue,
                                                        (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println("Map sorted by Values (Descending):");
        sortedByValueDesc.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
