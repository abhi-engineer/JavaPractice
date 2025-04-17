package string;

public class ReplaceSubString {
    public static void main(String[] args) {
        String s = "I love java Programming";
        String s1 = "love";
        String s2 = "live";
        s = s.replace(s1,s2);
        System.out.println(s);
    }
}
