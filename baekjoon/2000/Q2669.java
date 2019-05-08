import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        boolean[][] check = new boolean[101][101];
        for(int i = 0; i < 4; i++){
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            for(int x = x1; x < x2; x++){
                for(int y = y1; y < y2; y++){
                    check[x][y] = true;
                }
            }
        }

        int count = 0;
        for(int i = 0; i <= 100; i++){
            for(int j = 0; j <= 100; j++){
                if(check[i][j]) count++;
            }
        }
        System.out.println(count);
    }
}
