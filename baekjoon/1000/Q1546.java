import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        LinkedList<Double> list = new LinkedList<>();
        for(int i = 0; i < number; i++){
            list.add((double)sc.nextInt());
        }
        Collections.sort(list);

        double max = list.get(number-1);

        double result = 0;
        for(int i = 0; i < number; i++){
            result += list.get(i)/max*(double)100;
        }

        System.out.println(result / (double)number);
    }
}
