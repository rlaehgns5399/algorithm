import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String line = sc.next();

        String[] delimeter = {"dz=", "c=", "c-", "d-", "lj", "nj", "s=", "z="};

        for(int i = 0; i < delimeter.length; i++){
            if(line.contains(delimeter[i])){
                line = line.replace(delimeter[i], "?");
            }
        }
        System.out.println(line.length());
    }
}
