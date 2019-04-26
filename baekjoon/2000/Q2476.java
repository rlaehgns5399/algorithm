import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int max = 0;
        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            int temp = 0;
            if(a == b && b == c){
                temp = 10000 + (a * 1000);
            } else if(a == b && a != c){
                temp = 1000 + (a * 100);
            } else if(b == c && a != b){
                temp = 1000 + (b * 100);
            } else if(a == c && a != b) {
                temp = 1000 + (a * 100);
            } else {
                temp = Math.max(Math.max(a, b), c) * 100;
            }
            if(temp > max) max = temp;
        }
        System.out.println(max);
        br.close();

    }
}
