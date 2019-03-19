import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] stairs = new int[n+1];
        int[] dp = new int[n+1];

        for(int i = 1; i <= n; i++){
            stairs[i] = sc.nextInt();
        }

        dp[1] = stairs[1];
        dp[2] = Math.max(stairs[1] + stairs[2], stairs[2]);
        dp[3] = Math.max(stairs[1] + stairs[3], stairs[2] + stairs[3]);

        for(int i = 4; i <= n; i++){
            dp[i] = Math.max(dp[i-3] + stairs[i] + stairs[i-1], dp[i-2]+stairs[i]);
        }

        System.out.println(dp[n]);
    }
}
