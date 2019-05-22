import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        if(line.charAt(0) == '0'){
            if(line.length() >= 2 && line.charAt(1) == 'x'){

                String hex = "";
                for(int i = 2; i < line.length(); i++){
                    hex += line.charAt(i);
                }
                System.out.println(Integer.parseInt(hex, 16));
            } else {
                System.out.println(Integer.parseInt(line, 8));
            }
        } else {
            System.out.println(Integer.parseInt(line));
        }
    }
}
