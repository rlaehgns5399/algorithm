import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int[] order = new int[9];
        for(int i = 0; i < 9; i++){
            int temp = sc.nextInt();
            arr[i] = temp;
            order[i] = temp;
        }

        Arrays.sort(arr);

        System.out.println(arr[8]);
        for(int i = 0; i < 9; i++){
            if(order[i] == arr[8]) System.out.println(i+1);
        }
    }
}
