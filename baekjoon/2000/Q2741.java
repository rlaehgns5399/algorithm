import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());

        StringBuffer sb = new StringBuffer();
        for(int i = 1; i <= number; i++){
            sb.append(i + "\n");
        }
        System.out.println(sb.toString());
    }
}
