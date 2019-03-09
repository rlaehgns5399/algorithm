import java.util.LinkedList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for(int i = 0; i < testCase; i++){
            int n = sc.nextInt();
            LinkedList<Integer> list = new LinkedList<>();
            for(int j = 0; j < n; j++){
                list.add(sc.nextInt());
            }
            int sum = list.stream().mapToInt(x -> x).sum();
            float avg = (float)sum / (float)n;
            long number = list.stream().mapToDouble(x -> x).filter(x -> x > avg).count();
            System.out.printf("%.3f%%\n", (float)number / (float)list.size() * 100f);
        }
    }
}
