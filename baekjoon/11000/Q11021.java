import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < number; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            sb.append("Case #");
            sb.append(i+1);
            sb.append(": ");
            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}
