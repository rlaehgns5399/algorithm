import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String args[]) throws IOException {
        List<Integer> array = new ArrayList<>();
        int[] frequencyArray = new int[8001];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            int number = Integer.parseInt(br.readLine());
            array.add(number);
            frequencyArray[number+4000]++;
        }

        long mean = 0;
        for(int i = 0; i < n; i++){
            mean += array.get(i);
        }
        mean = Math.round( (double)mean / (double)n );

        System.out.println(mean);

        ArrayList<Integer> frequencyList = new ArrayList<>();

        int frequencyValue = Integer.MIN_VALUE;
        for(int i = 0; i <= 8000; i++){
            if(frequencyArray[i] > frequencyValue) frequencyValue = frequencyArray[i];
        }

        for(int i = 0; i <= 8000; i++){
            if(frequencyArray[i] == frequencyValue) frequencyList.add(i-4000);
        }

        Collections.sort(array);

        int median = array.get(n/2);
        System.out.println(median);

        Collections.sort(frequencyList);

        int frequency;
        if(frequencyList.size() > 1) {
            frequency = frequencyList.get(1);
        } else {
            frequency = frequencyList.get(0);
        }
        System.out.println(frequency);

        int range = Math.abs(array.get(0) - array.get(array.size() - 1));
        System.out.println(range);
    }
}
