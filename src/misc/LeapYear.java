package misc;

public class LeapYear {

    public boolean isLeap(int year){
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public static void main(String[] args) {
        LeapYear obj = new LeapYear();
        boolean b = obj.isLeap(4200);
        System.out.println(b);
    }
}

// year 400 se divisible hona chiye
// agr 400 nai hora to  =>
// ya to 4 se hona chiye and 100 se nai hona chiye
