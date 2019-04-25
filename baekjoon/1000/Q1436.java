import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n+1];

        int counter = 1;
        int start = 666;
        while(counter <= n){
            if(String.valueOf(start).contains("666")){
                array[counter++] = start;
            }
            start++;
        }
        System.out.println(array[n]);
    }
}
