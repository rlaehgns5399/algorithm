import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] basket = new int[n+1];
        int m = sc.nextInt();

        for(int i = 0; i < m; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            int number = sc.nextInt();

            for(int j = start; j <= end; j++){
                basket[j] = number;
            }
        }

        for(int i = 1; i <= n; i++){
            System.out.print(basket[i] + " ");
        }
    }
}
