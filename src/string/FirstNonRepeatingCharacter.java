package string;

import java.util.*;

public class FirstNonRepeatingCharacter {

    public int find(String s){
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1){
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == entry.getKey())
                        return i;
                }
            }
        }
        return -1;
    }

    public int find2(String s){
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        String s = "aabaaacbbbbccccde";
        FirstNonRepeatingCharacter obj = new FirstNonRepeatingCharacter();

        int index = obj.find2(s);

        System.out.println(index);
    }
}

/*
linkedHashmap stores in insertion order, other map classes doesn't maintain insertion order
in fact linkedHashmap , linkedHashSet, etc all maintains insertion order
 */
