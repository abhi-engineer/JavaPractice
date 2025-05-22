package collection.arrayList;


import java.util.*;

public class Basic {
    public static void main(String[] args) {

        // creation
        ArrayList<Integer> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>(); // default starting size 10
        List<Integer> list3 = new ArrayList<>(50); // created with size 50
        List<Integer> list4 = new ArrayList<>(list3); // created arrayglist from anohter arraylist
        List<Integer> list5 = Arrays.asList(51,32,13,43,15); // created mutable and fixed size arraylist by array
        List<String> list6 = List.of("Abhi","Sharma","Developer","Java","Angular"); // created mutable and fixed size arraylist.

        // getting arraylist element
        list1.add(10); // adding one element in the end
        list2.add("Apple");
        list1.add(0,15); // adding one element in specified index, other element has to shift.
        list1.set(1,19); // setting element in specified element, it replaces the element, if any element is present there
        list2.addAll(list6); // adding all elements form list3 to list1;
        for(int i : list1)
            System.out.println(i);

        // removing arraylist element
        list1.remove(1); // removing value from index 1
        list1.remove(Integer.valueOf(0)); // removing object 10 from list   remove has overriden methods
        list2.remove("Apple"); // removing specified object

        // converting arraylist to array
        Object[] arr1 = list1.toArray(); // list.toArray() return array of Object type
        Integer[] arr2 = list3.toArray(new Integer[0]); // creating a array arr2 from list3, it is convention , we pass a empty array with index 0.


        // sorting an arraylist
        Collections.sort(list1); // sorting in ascending order
        Collections.sort(list1.reversed()); // sorting in descending order

        list1.sort(null); // sorting in ascending order
        list5.sort((o1,o2) -> o1-o2); // sorting in ascending order
        list5.sort((o1,o2) -> o2-o1); // sorting in descending order
        list2.sort((o1,o2) -> o1.length()-o2.length()); // sorting string list on the basis of length
        list2.sort((o1,o2) -> o2.length()-o1.length()); // sorting string list on the basis of length
        list1.sort(Comparator.comparingInt((i) -> i)); //
        System.out.println(list2);

    }
}
