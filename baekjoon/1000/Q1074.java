import java.util.Scanner;

public class Main {
    public static int counter;
    public static int R;
    public static int C;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        R = sc.nextInt();
        C = sc.nextInt();

        divide((int)Math.pow(2, N));
    }
    public static void divide(int size){
        divide(size, 0, 0);
    }
    public static void divide(int size, int r, int c){
        if(size == 2){
            if(r == R && c == C){
                System.out.println(counter);
                return;
            }
            counter++;
            if(r == R && c+1 == C){
                System.out.println(counter);
                return;
            }
            counter++;
            if(r+1 == R && c == C){
                System.out.println(counter);
                return;
            }
            counter++;
            if(r+1 == R && c+1 == C){
                System.out.println(counter);
                return;
            }
            counter++;
        } else {
            divide(size/2, r, c);
            divide(size/2, r, c + size / 2);
            divide(size/2, r + size / 2, c);
            divide(size/2, r + size / 2, c + size / 2);
        }
    }
}
