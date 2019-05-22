import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int result = 0;
        int x = 1;
        for(int i = line.length()-1; i >= 0; i--){
            int now = 0;
            switch(line.charAt(i)){
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    now = Integer.parseInt(Character.toString(line.charAt(i)));
                    break;
                case 'A':
                    now = 10;
                    break;
                case 'B':
                    now = 11;
                    break;
                case 'C':
                    now = 12;
                    break;
                case 'D':
                    now = 13;
                    break;
                case 'E':
                    now = 14;
                    break;
                case 'F':
                    now = 15;
                    break;
            }
            result += now * x;
            x *= 16;
        }
        System.out.println(result);
    }
}
