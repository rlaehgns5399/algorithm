import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] dp = new long[91];

        dp[1] = 1;  // 1
        dp[2] = 1;  // 10
        dp[3] = 2;  // 100, 101
        for(int i = 4; i <= n; i++){
            dp[i] = dp[i-2] + dp[i-1];
        }
        System.out.print(dp[n]);

        sc.close();
    }
}
