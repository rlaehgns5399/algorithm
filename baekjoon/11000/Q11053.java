import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());
        int[] arr = new int[1000];
        int[] dp = new int[1000];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < number; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dp[0] = 1;
        for(int i = 1; i < number; i++){
            dp[i] = 1;
            for(int j = 0; j < i; j++){
                if(arr[i] > arr[j] && dp[i] < dp[j] + 1) dp[i] = dp[j] + 1;
            }
        }
        System.out.println(Arrays.stream(dp).max().getAsInt());
    }
}
