import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[1001];
        arr[1] = 1;
        arr[2] = 2;
        for(int i = 3; i <= 1000; i++){
            arr[i] = ( arr[i-2] % 10007 ) + ( arr[i-1] % 10007 );
        }
        System.out.println(arr[sc.nextInt()] % 10007);
    }
}
