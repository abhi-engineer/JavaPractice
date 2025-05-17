package string;

public class CheckIfOneStringIsRotationOfAnother {

    public static boolean stringRotationCheck(String s1, String s2){
        if(s1.length() != s2.length()) return false;
        String s = s1 + s1;
//        return s.contains(s2);    // inbuilt method of string to check , whether the given substring is present in string or not;

        //mannualy checking
        for(int i = 0; i <= s1.length(); i++){
            int j = 0;
            while( j < s2.length()){
                if(s.charAt(i + j) != s2.charAt(j)) {
                    break;
                }
                j++;
            }
            if(j == s2.length()) return true; // full match found
        }

        return false;
    }

    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";
        System.out.println(stringRotationCheck(s1, s2)); // true
    }
}
