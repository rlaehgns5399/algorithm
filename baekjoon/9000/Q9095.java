import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int[] dp = new int[100];
        int number = sc.nextInt();

        dp[0] = 0;
        dp[1] = 1; // 1
        dp[2] = 2; // 1 + 1, 2
        dp[3] = 4; // 1 + 1 + 1, 2 + 1, 1 + 2, 3


        for(int i = 4; i <= 10; i++){
            dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
        }

        for(int i = 0; i < number; i++){
            System.out.println(dp[sc.nextInt()]);
        }
    }
}
