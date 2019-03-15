import java.util.Scanner;
import java.util.Calendar;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int mon = sc.nextInt();
        int day = sc.nextInt();

        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, 2007);
        c.set(Calendar.MONTH, mon-1);
        c.set(Calendar.DATE, day);
        int a = c.get(Calendar.DAY_OF_WEEK);
        String[] result = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        System.out.println(result[a-1]);
    }
}
