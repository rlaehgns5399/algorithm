import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            int h = sc.nextInt();
            int w = sc.nextInt();
            int N = sc.nextInt();

            int floor = (N - 1) % h + 1;
            int room = ((N -1) / h) + 1;
            System.out.printf("%d%02d\n", floor, room);
        }
    }
}
