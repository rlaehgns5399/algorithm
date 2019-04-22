import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int sum = 0;
        int min = -1;
        for(int i = 1; i <= 100; i++){
            if(i*i >= m && i*i <= n){
                sum += i*i;
                if(min == -1) min = i*i;
            }
        }

        if(min == -1){
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
