import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int a = factorial(sc.nextInt());
        
        System.out.println(a);
    }
    public static int factorial(int n){
        if(n <= 1) return 1;
        return n * factorial(n-1);
    }
}
