import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int digit = sc.nextInt();
        String line = sc.next();
        
        int result = 0;
        for(int i = 0; i <= digit-1; i++){
        	result += Integer.parseInt(Character.toString(line.charAt(i)));
        }
        System.out.println(result);
    }
}
