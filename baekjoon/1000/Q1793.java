import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        BigInteger[] dp = new BigInteger[251];
        dp[0] = BigInteger.valueOf(1);  // 이거 왜 1?
        dp[1] = BigInteger.valueOf(1);  // 1
        dp[2] = BigInteger.valueOf(3);  // 3
        dp[3] = BigInteger.valueOf(5);  // 4

        for(int i = 4; i <= 250; i++){
            dp[i] = dp[i-1].add(dp[i-2].multiply(BigInteger.valueOf(2)));
        }
        while(sc.hasNextInt()){
            System.out.println(dp[sc.nextInt()]);
        }
    }
}
