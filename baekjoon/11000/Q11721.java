import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String line = sc.next();
        
        int n = 1;
        for(int i = 0; i < line.length(); i++){
        	System.out.print(line.charAt(i));
        	if(n % 10 == 0) System.out.println();
        	n++;
        }
    }
}
