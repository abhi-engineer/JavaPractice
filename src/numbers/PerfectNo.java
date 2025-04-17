package numbers;

public class PerfectNo {

    public boolean isBoolean(int num){
        int sum = 0;
        for(int i=num-1; i>0; i--){
            if(num%i == 0)
                sum += i;
        }
        return num == sum;
    }

    public static void main(String[] args) {
        PerfectNo obj = new PerfectNo();
        System.out.println(obj.isBoolean(6));
    }
}
