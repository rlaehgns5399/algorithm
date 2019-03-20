import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        BigInteger b = BigInteger.valueOf(1);
        for(int i = n; i > 0; i--){
            b = b.multiply(BigInteger.valueOf(i));
        }
        String s = b.toString();
        int result = 0;
        for(int i = s.length()-1; i >= 0; i--){
            if(s.charAt(i) == '0'){
                result++;
            } else {
                System.out.print(result);
                break;
            }
        }
    }
}
