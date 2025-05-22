package collection.arrayList;

import stream.Student;

import java.util.ArrayList;
import java.util.List;

public class sortObjectArraylist {
    public static void main(String[] args) {

        Student s1 = new Student(1, "Alice", 20, 85.5);
        Student s2 = new Student(2, "Charlie", 22, 90.0);
        Student s3 = new Student(3, "Bob", 23, 78.4);
        Student s4 = new Student(4, "Eva", 21, 88.8);
        Student s5 = new Student(5, "David", 24, 92.3);

        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        list.sort((a,b) -> a.getName().compareTo(b.getName()));

        System.out.println(list);
    }
}
