import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        boolean[][] chess = new boolean[n][m];
        for(int i = 0; i < n; i++){
            String chessStatus = sc.next();
            for(int j = 0; j < m; j++){
                // B is true, W is false
                if(chessStatus.charAt(j) == 'B'){
                    chess[i][j] = true;
                } else {
                    chess[i][j] = false;
                }
            }
        }

        int min = Integer.MAX_VALUE;
        for(int r = 0; r <= n - 8; r++){
            for(int c = 0; c <= m - 8; c++){
                int blackFirst = 0, whiteFirst = 0;
                // 왼쪽 맨 위 검은색일 때 검사

                for(int i = r; i < r + 8; i++){
                    for(int j = c; j < c + 8; j++){
                        if(i % 2 == 0 && j % 2 == 0 && chess[i][j] == false) blackFirst++;
                        if(i % 2 == 1 && j % 2 == 0 && chess[i][j] == true) blackFirst++;
                        if(i % 2 == 0 && j % 2 == 1 && chess[i][j] == true) blackFirst++;
                        if(i % 2 == 1 && j % 2 == 1 && chess[i][j] == false) blackFirst++;
                    }
                }
                
                // 왼쪽 맨 위 흰색일 때 검사
                for(int i = r; i < r + 8; i++){
                    for(int j = c; j < c + 8; j++){
                        if(i % 2 == 0 && j % 2 == 0 && chess[i][j] == true) whiteFirst++;
                        if(i % 2 == 1 && j % 2 == 0 && chess[i][j] == false) whiteFirst++;
                        if(i % 2 == 0 && j % 2 == 1 && chess[i][j] == false) whiteFirst++;
                        if(i % 2 == 1 && j % 2 == 1 && chess[i][j] == true) whiteFirst++;
                    }
                }
                min = Math.min(min, Math.min(blackFirst, whiteFirst));
            }
        }
        System.out.println(min);
    }
}
