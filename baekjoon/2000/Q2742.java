import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuffer sb = new StringBuffer();
        for(int i = n; i >= 1; i--){
            sb.append(i);
            sb.append("\n");
        }
        System.out.println(sb.toString());
        sc.close();
    }
}
