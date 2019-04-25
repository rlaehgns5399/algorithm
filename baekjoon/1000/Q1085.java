import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int case1 = Math.abs(x - w);
        int case2 = Math.abs(y - h);

        int min = Math.min(Math.min(Math.min(case1, x), case2), y);
        System.out.println(min);
    }
}
