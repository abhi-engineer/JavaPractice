package string;

import java.util.HashMap;
import java.util.Map;

/*
=> Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
        Symbol       Value
        I             1
        V             5
        X             10
        L             50
        C             100
        D             500
        M             1000
*/
public class RomanToInteger {

    public static int romanToInt(String s) {
        StringBuilder ch = new StringBuilder();
        int i = 0;
        int num = 0;
        while(i<s.length()){
            ch.setLength(0);
            ch.append(s.charAt(i));
            if(i < s.length()-1) {
                if (ch.toString().equals("I")) {
                    i++;
                    ch.append(s.charAt(i));
                    if (ch.toString().equals("IV"))
                        num += 4;
                    else if (ch.toString().equals("IX"))
                        num += 9;
                    else {
                        i--;
                        num += 1;
                    }
                } else if (ch.toString().equals("X")) {
                    i++;
                    ch.append(s.charAt(i));
                    if (ch.toString().equals("XL"))
                        num += 40;
                    else if (ch.toString().equals("XC"))
                        num += 90;
                    else {
                        i--;
                        num += 10;
                    }
                } else if (ch.toString().equals("C")) {
                    i++;
                    ch.append(s.charAt(i));
                    if (ch.toString().equals("CD"))
                        num += 400;
                    else if (ch.toString().equals("CM"))
                        num += 900;
                    else {
                        i--;
                        num += 100;
                    }
                } else {
                    if (ch.toString().equals("V"))
                        num += 5;
                    else if (ch.toString().equals("L"))
                        num += 50;
                    else if (ch.toString().equals("D"))
                        num += 500;
                    else if (ch.toString().equals("M"))
                        num += 1000;
                }
            }
            else{
                if (ch.toString().equals("I"))
                    num += 1;
                else if (ch.toString().equals("V"))
                    num += 5;
                else if (ch.toString().equals("X"))
                    num += 10;
                else if (ch.toString().equals("L"))
                    num += 50;
                else if (ch.toString().equals("C"))
                    num += 100;
                else if (ch.toString().equals("D"))
                    num += 500;
                else if (ch.toString().equals("M"))
                    num += 1000;
            }
            i++;
        }
        return num;
    }

    public static int romanToInt2(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        map.put("IV", 4);
        map.put("IX", 9);
        map.put("XL", 40);
        map.put("XC", 90);
        map.put("CD", 400);
        map.put("CM", 900);

        int i = 0, num = 0;
        while (i < s.length()) {
            if (i + 1 < s.length() && map.containsKey(s.substring(i, i + 2))) {
                num += map.get(s.substring(i, i + 2));
                i += 2;
            } else {
                num += map.get(s.substring(i, i + 1));
                i++;
            }
        }

        return num;
    }

    public static void main(String[] args) {
        String s = "LVIII";
        System.out.println(romanToInt(s));
    }
}



