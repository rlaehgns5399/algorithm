import java.util.*;

public class Solution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        List<X> list = new LinkedList<>();

        int intcounter = 0;
        int charCounter = 0;
        for(int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (c >= (int) 'A' && c <= (int) 'Z') {
                if (i + 1 < a.length() && a.charAt(i + 1) >= (int) 'a' && a.charAt(i + 1) <= (int) 'z') {
                    list.add(new X(Character.toString(c) + Character.toString(a.charAt(i + 1)), 0));
                    i++;
                } else {
                    list.add(new X(Character.toString(c), 0));
                }
                charCounter++;
            }

            if (c >= (int)'0' && c <= (int)'9'){
                if(intcounter < charCounter){
                    if (i+1 < a.length() &&  c == '1' && a.charAt(i+1) == '0'){
                        list.get(intcounter++).i = Integer.parseInt( Character.toString(c) + Character.toString(a.charAt(i+1)));
                        i++;
                    } else {
                        list.get(intcounter++).i = Integer.parseInt(Character.toString(c));
                    }
                } else {
                    System.out.println("error");
                    return;
                }
            }
        }
        StringBuffer sb = new StringBuffer();
        for(X x : list){
            if(x.i == 0){
                System.out.println("error");
                return;
            }
            if(x.i == 1){
                sb.append(x.s);
            } else {
                sb.append(x.s + x.i);
            }
        }
        System.out.print(sb.toString());

    }
}

class X{
    public String s;
    public int i;
    public X(String s, int i){
        this.s = s;
        this.i = i;
    }
}
