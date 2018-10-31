package Line;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Q1 {
    public static void main(String... args) {
        String input = new Scanner(System.in).nextLine().trim();
        final StringTokenizer tokenizer = new StringTokenizer(input);
        
        int money = 20000;
        while (tokenizer.hasMoreTokens()) {
            int distance = Integer.parseInt(tokenizer.nextToken());
            if(distance >= 4 && distance <= 178){
            	if(distance <= 40) {
					if(money >= 720){
            			money -= 720;
					} else {
						break;
					}
            	} else {
            		int remain = (int)Math.ceil((distance - 40) / 8.0);
					if(money >= 720 + (remain * 80)){
						money -= 720 + (remain * 80);
					} else {
						break;
					}
            	}
            } else {
            	break;
            }
        }
        System.out.println(money);
    }
}
