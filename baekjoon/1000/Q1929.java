import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        final int MAXIMUM = 1000000;
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.close();

        boolean[] arr = new boolean[MAXIMUM + 1];
        // 모든 값을 소수로 본다
        for(int i = 2; i <= MAXIMUM; i++) arr[i] = true;

        // 거르자
        for(int i = 2; i <= MAXIMUM; i++){
            if(arr[i]) {
                for (int j = i + i; j <= MAXIMUM; j = j + i) {
                    arr[j] = false;
                }
            }
        }

        StringBuffer sb = new StringBuffer();
        for(int i = m; i <= n; i++){
            if(arr[i]) {
                sb.append(i);
                sb.append("\n");
            }
        }
        System.out.print(sb.toString());
    }
}
