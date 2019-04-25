import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine().toUpperCase();

        int[] charCounter = new int[26];
        for(int i = 0; i < line.length(); i++){
            charCounter[line.charAt(i) - (int)'A']++;
        }

        int max = 0;
        boolean duplicated = false;
        for(int i = 0; i < 26; i++){
            if(charCounter[i] > charCounter[max]) {
                max = i;
            }
        }

        for(int i = 0; i < 26; i++){
            if(max == i) continue;
            if(charCounter[max] == charCounter[i]){
                System.out.println("?");
                return;
            }
        }
        System.out.println((char)(max + (int)'A'));
    }
}
