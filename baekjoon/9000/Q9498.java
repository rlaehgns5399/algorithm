import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int score = sc.nextInt();
        
        if(score <= 100 && score >= 90) print("A");
        else if(score <= 89 && score >= 80) print("B");
        else if(score <= 79 && score >= 70) print("C");
        else if(score <= 69 && score >= 60) print("D");
        else { print("F"); }
        
        sc.close();
    }
    private static void print(String s){
    	System.out.println(s);
    }
}
