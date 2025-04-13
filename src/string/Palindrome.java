package string;

public class Palindrome {

    public boolean palindrome(String s){
//        StringBuilder sb = new StringBuilder(s);
//        return s.equals(sb.reverse().toString());
        for(int i=0, j=s.length()-1; i<s.length()/2; i++,j--){
            if(s.charAt(i) != s.charAt(j))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        String s = "abccba";
        boolean b = p.palindrome(s);
        System.out.println(b);
    }
}
