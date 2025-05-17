package string;

public class LongestSubstringWithoutRepeatingCharacters {

    public static String check(String s){
        String temp = "";
        String res = "";
        for(int i=0; i<s.length(); i++){
            int index = i;
            while((index < s.length()) && !temp.contains(String.valueOf(s.charAt(index)))){
                    temp = temp.concat(String.valueOf(s.charAt(index)));
                    index++;
            }

            System.out.println(temp);   // prints all possible unique character substring

            if(res.length() <= temp.length()) {
                res = temp;
            }
            temp = "";
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(check(s));
    }
}

/*
✅ Example 1:

Input: "abcabcbb"
Unique substrings:

    "abc" → length 3

    "bca" → length 3

    "cab" → length 3

Longest: "abc" (or "bca" or "cab") → Length = 3
✅ Example 2:

Input: "bbbbb"
Unique substrings:

    "b" → repeated character

Longest: "b" → Length = 1
✅ Example 3:

Input: "pwwkew"
Unique substrings:

    "pw" → length 2

    "wke" → length 3

    "kew" → length 3

Longest: "wke" or "kew" → Length = 3

 */