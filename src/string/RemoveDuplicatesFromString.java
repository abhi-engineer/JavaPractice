package string;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromString {

    private static String removeDuplicate(String s){
        char[] ch = s.toCharArray();
        for(int i=0; i<s.length(); i++){
            if(ch[i] != '_'){
            for(int j=i+1; j<ch.length; j++){
                    if(ch[i] == s.charAt(j))
                        ch[j] = '_';
                }
            }
        }
        s = "";
        for(char c : ch){
            if(c != '_')
                s += c;
        }

        return s;
    }

    public static void main(String[] args) {
        String s = "abccabefga";
        s = removeDuplicate(s);
        System.out.println(s);
    }
}
