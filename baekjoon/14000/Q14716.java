import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static int col, row;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] main = br.readLine().split(" ");
        col = Integer.parseInt(main[0]);
        row = Integer.parseInt(main[1]);

        int[][] arr = new int[col][row];
        for(int i = 0; i < col; i++){
            String[] line = br.readLine().split(" ");
            for(int j = 0; j < row; j++){
                arr[i][j] = Integer.parseInt(line[j]);
            }
        }

        br.close();
        
        int count = 0;
        while(true){
            int[] p = getFirstOne(arr);
            if(p == null) break;
            count++;
            Queue<XY> q = new LinkedList<XY>();
            q.add(new XY(p[0], p[1]));
            while(!q.isEmpty()){
                XY item = q.poll();
                arr[item.x][item.y] = 0;

                for(int i = item.x-1; i <= item.x+1; i++){
                    for(int j = item.y-1; j <= item.y+1; j++){
                        if(i >= 0 && i < col && j >= 0 && j < row && arr[i][j] == 1){
                            arr[i][j] = 0;
                            q.add(new XY(i, j));
                        }
                    }
                }
            }
        }
        System.out.print(count);
    }
    public static int[] getFirstOne(int[][] arr){
        int[] x = new int[2];
        for(int i = 0; i < col; i++){
            for(int j = 0; j < row; j++){
                if(arr[i][j] == 1){
                    x[0] = i;
                    x[1] = j;
                    return x;
                }
            }
        }
        return null;
    }
}
class XY{
    public int x;
    public int y;
    public XY(int x, int y){
        this.x = x;
        this.y = y;
    }
}
