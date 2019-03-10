import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        HashMap<Integer, Integer> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());

        int[] A = new int[4001];
        int[] B = new int[4001];
        int[] C = new int[4001];
        int[] D = new int[4001];

        for(int i = 0; i < number; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            A[i] = Integer.parseInt(st.nextToken());
            B[i] = Integer.parseInt(st.nextToken());
            C[i] = Integer.parseInt(st.nextToken());
            D[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < number; i++){
            for(int j = 0; j < number; j++){
                int CplusD = C[i] + D[j];
                if(map.get(CplusD) != null) {
                    int intercept = map.get(CplusD);
                    map.put(CplusD, intercept+1);
                } else {
                    map.put(CplusD, 1);
                }
            }
        }

        long result = 0;
        for(int i = 0; i < number; i++){
            for(int j = 0; j < number; j++){
                int AplusB = -(A[i] + B[j]);
                if(map.get(AplusB) != null){
                    result += map.get(AplusB);
                }
            }
        }
        System.out.println(result);
    }
}
