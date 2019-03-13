import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int q = 0; q < a; q++){
            int n = sc.nextInt();
            int m = sc.nextInt();

            long[][] dp = new long[n+1][m+1];


            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= m; j++){
                    if((i == 1 || j == 1) && i <= j) {
                        dp[i][j] = i * j;
                    }
                    else if(i == j) {
                        dp[i][j] = 1;
                    }
                    else {
                        if ( i <= j) {
                            dp[i][j] = dp[i][j - 1] + dp[i - 1][j - 1];
                        }
                    }
                }
            }
            System.out.println(dp[n][m]);
        }
    }
}
