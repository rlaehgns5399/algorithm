import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double b = Math.atan(1 / (double)a);
        int result = 1;
        while(result * b < Math.PI) {
            result++;
        }
        System.out.println(result-1);
    }
}
