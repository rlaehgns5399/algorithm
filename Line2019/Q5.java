import java.util.Scanner;

/**
 * Created by KimDoHoon on 2019-03-16 016.
 */
public class Q5 {
    public static void main(String[] args){

        Scanner sc =  new Scanner(System.in);

        int[] dp = new int[200001];
        int a = sc.nextInt();
        int b = sc.nextInt();


        for(int e = 0; e <= 200000; e++){
            dp[e] = Integer.MAX_VALUE;
        }
        dp[b] = 0;
        if(a == b) {
            System.out.println(0);
            return;
        }
        int acc = 1;
        int i = 0;
        while ( a <= 200000) {
            a += acc++;
            for(int k = 0; k <= 200000; k++){
                if(dp[k] == i) {
                    if (k - 1 >= 0) {
                        if(k-1 == a){
                            System.out.println(i+1);
                            return;
                        }
                        dp[k - 1] = i + 1;
                    }
                    if (k + 1 <= 200000) {
                        if(k+1 == a){
                            System.out.println(i+1);
                            return;
                        }
                        dp[k + 1] = i + 1;
                    }
                    if (k * 2 <= 200000) {
                        if(k*2 == a){
                            System.out.println(i+1);
                            return;
                        }
                        dp[k * 2] = i + 1;
                    }
                } else if(dp[k] < i) dp[k] = Integer.MAX_VALUE;
            }

            i++;
        }
        System.out.println(-1);
    }
}
