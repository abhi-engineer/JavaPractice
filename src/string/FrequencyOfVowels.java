package string;

public class FrequencyOfVowels {

    private int calculate(String s) {
        int count = 0;
        s = s.toLowerCase();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='a'|| s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        FrequencyOfVowels obj = new FrequencyOfVowels();
        int count = obj.calculate("abbcccddddeeeeeffffff");
        System.out.println(count);
    }


}
