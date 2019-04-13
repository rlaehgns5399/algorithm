import java.util.Arrays;

public class Q3 {
    public static void main(String args[]) {
        int[] p = new int[300000];
        System.out.println(Solution(p));
    }
    private static int Solution(int[] T){
        if(T.length == 2) return 1;

        int min = Integer.MAX_VALUE;
        for(int i = 1; i < T.length; i++){
            int[] l = new int[i];
            int[] r = new int[T.length-i];

            for(int k = 0; k < T.length; k++){
                if(k < l.length){
                    l[k] = T[k];
                } else {
                    r[k - l.length] = T[k];
                }
            }
            int l_min = Arrays.stream(l).min().getAsInt();
            int r_min = Arrays.stream(r).min().getAsInt();
            int l_max = Arrays.stream(l).max().getAsInt();

            /*
            for(int d = 0; d < l.length; d++){
                System.out.print(l[d] + " ");
            }
            System.out.print("/ ");
            for(int d = 0; d < r.length; d++){
                System.out.print(r[d] + " ");
            }
            System.out.println();
            */
            if( l_min < r_min && l_max < r_min && l.length < min){
                min = l.length;
            }
        }
        return min;
    }
}
