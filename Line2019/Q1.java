import java.util.LinkedList;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by KimDoHoon on 2019-03-16 016.
 */
public class Q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long x = (long) Math.sqrt(n);

        LinkedList<Long> list = new LinkedList<Long>();
        SortedSet<Long> result = new TreeSet<Long>();
        if(Math.pow(x, 2) == n){
            System.out.println(0);
            return;
        } else {
            long i = 0;
            for(i = 1; i * i < n; i++){
                if(n % i == 0){
                    list.add(i);
                    list.add(n/i);
                }
            }
            if(i*i == n) list.add(n);

            for(long q : list){
                for(long j : list){
                    if(q * j == n) {
                        result.add(Math.abs(q-j));
                    }
                }
            }
        }
        System.out.println(result.first());
    }
}
