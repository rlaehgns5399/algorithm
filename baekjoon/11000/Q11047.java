import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int coin = sc.nextInt();
        int goal = sc.nextInt();

        int[] arr = new int[coin];
        for(int i = 0; i < coin; i++){
            arr[i] = sc.nextInt();
        }

        int count = 0;
        while(goal != 0){
            for(int i = coin-1; i >= 0; i--){
                int a = goal / arr[i];
                if( a > 0 ){
                    goal -= arr[i] * a;
                    count += a;
                }
            }
        }
        System.out.println(count);
    }
}
