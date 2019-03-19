import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[1001];
        dp[1] = 1;  // 1
        dp[2] = 3;  // 3
        dp[3] = 5;  // 4

        for(int i = 4; i <= n; i++){
            dp[i] = dp[i-1] + ((2 * dp[i-2]) % 10007);
            dp[i] %= 10007;
        }
        System.out.println(dp[n]);
    }
}
