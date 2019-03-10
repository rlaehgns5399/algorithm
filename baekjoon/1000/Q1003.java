import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        int[] arr = new int[41];
        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2; i <= 40; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
           int fibo = sc.nextInt();
           if(fibo == 0) {
               System.out.println("1 0");
           } else if(fibo == 1) {
               System.out.println("0 1");
           } else {
               System.out.println(arr[fibo-1] + " " + arr[fibo]);
           }
        }
    }
}
