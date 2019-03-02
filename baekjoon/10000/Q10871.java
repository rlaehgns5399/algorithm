import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int count = sc.nextInt();
        int criteria = sc.nextInt();
        
        for(int i = 0; i < count; i++){
        	int now = sc.nextInt();
        	if(criteria > now) {
        		if(i != count -1) {
        			System.out.print(now + " ");
        		} else {
        			System.out.print(now);
        		}
        	}
        }
        
        sc.close();
    }
}
