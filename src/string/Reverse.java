package string;

public class Reverse {
    public String reverse(String s){
//        StringBuilder sb = new StringBuilder();
        char[] ch = new char[s.length()];
        for(int i = s.length()-1, j=0; i >=0; i--,j++){
//            sb.append(s.charAt(i));
            ch[j] = s.charAt(i);
        }
//        return sb.toString();
        return new String(ch);
    }

    public static void main(String[] args) {
        Reverse obj = new Reverse();
        String s = "String";
        String reverseWord = obj.reverse(s);
        System.out.println(reverseWord);
    }
}

/*
we can take char array here in place of StringBuilder but, we have to declare
a new variable for loop.
 */