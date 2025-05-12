package string;

public class Anagrams {

    // sorting string character   // bubble sort, largest element goes at end after ist iteration
    public String sort(String s){
        s = s.toLowerCase();
        char[] ch = s.toCharArray();
        for(int i=0; i<ch.length-1; i++){
            for(int j=0; j<ch.length-i-1; j++){
                if(ch[j] > ch[j+1]){
                    char temp = ch[j];
                    ch[j] = ch[j+1];
                    ch[j+1] = temp;
                }
            }
        }
        return new String(ch);
    }

    public boolean isAnagram(String s1, String  s2){
        if(s1.length() != s2.length())
            return false;
        s1 = sort(s1);
        s2 = sort(s2);
        return s1.equals(s2);
    }

    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listen";
        Anagrams obj = new Anagrams();

        boolean b = obj.isAnagram(s1,s2);

        System.out.println(b);
    }
}
