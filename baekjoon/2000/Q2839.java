import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = -1;
        for(int a = 0; a * 5 <= n; a++){
            for(int b = 0; a * 5 + b * 3 <= n; b++){
                if(a * 5 + b * 3 == n){
                    result = a + b;
                }
            }
        }
        System.out.println(result);
    }
}
