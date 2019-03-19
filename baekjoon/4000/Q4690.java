public class Main {
    public static void main(String args[]){
        for(int a = 2; a <= 100; a++){
            for(int b = 2; b <= 100; b++){
                for(int c = b+1; c <= 100; c++){
                    for(int d = c+1; d <= 100; d++){
                        if((a*a*a) == (b*b*b)+(c*c*c)+(d*d*d)){
                            System.out.println("Cube = " + a + ", Triple = (" + b + "," + c + "," + d +")");
                        }
                    }
                }
            }
        }
    }
}
