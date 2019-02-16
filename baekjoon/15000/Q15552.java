import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < Integer.parseInt(s); i++){
            String eq = br.readLine();
            StringTokenizer st = new StringTokenizer(eq);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(a + b);
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
