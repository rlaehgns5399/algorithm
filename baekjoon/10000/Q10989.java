import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());

        int[] count = new int[10001]; // 자동으로 0으로 초기화
        for(int i = 1; i <= number; i++){
            count[Integer.parseInt(br.readLine())]++;
        }

        StringBuffer sb = new StringBuffer();
        for(int i = 1; i <= 10000; i++){
            for(int j = 0; j < count[i]; j++){
                sb.append(i);
                sb.append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}
