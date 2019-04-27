import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int level = 0;
        int now = 1;
        if( n == 1){
            System.out.println(1);
            return;
        }
        level++;
        while(true){
            if( n > now && n <= now + level * 6){
                System.out.println(level+1);
                return;
            }
            now += level * 6;
            level++;
        }
    }
}
