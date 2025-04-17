package string;

import java.util.HashMap;
import java.util.Map;

public class Frequency {

    public void calculate(String s){
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() +" : "+entry.getValue());
        }
    }

    public static void main(String[] args) {
        Frequency obj = new Frequency();
        obj.calculate("abbcccddddeeeeeffffff");

    }
}
