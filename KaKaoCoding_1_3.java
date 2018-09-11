import java.util.LinkedList;
import java.util.List;

public class KaKaoCoding_1_3 extends Print{
	public KaKaoCoding_1_3(int n, String[] str){
		if(n == 0){
			System.out.println(5 * str.length);
		} else {
			int result = 0;
			List<String> queue = new LinkedList<String>();
			
			for(int i = 0; i < str.length; i++){
				String item = str[i].toLowerCase();
				if(!queue.contains(item)){
					if(queue.size() + 1 > n){
						queue.remove(0);
					}
					queue.add(item);
					result += 5;
				} else if(queue.contains(item)){
					queue.remove(item);
					queue.add(item);
					result += 1;
				} 
				
				/**
				System.out.print(i + "(" + str[i] + "): ");
				for(String s : queue){
					System.out.print(s + " ");
				}
				System.out.println("\nresult: " + result);
				*/
			}
			System.out.println(result);
		}
		
	}
}
