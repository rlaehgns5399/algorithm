import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for(int i = 0; i < number; i++){
            String VPS = sc.next();
            int stack = 0;
            for(int j = 0; j < VPS.length(); j++){
                if(VPS.charAt(j) == '(') {
                    stack++;
                }
                if(VPS.charAt(j) == ')') {
                    stack--;
                    if(stack < 0) break;
                }
            }

            if(stack == 0){
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}
