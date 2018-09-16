import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class q2 {

	public static void main(String[] args) {
		int[] b = {2, 1, 2, 6, 2, 4, 3, 3};
		int[] a = solution(5, b);
		
		for(int i = 0; i < a.length; i++){
			// System.out.print(a[i] + " ");
		}
	}
	public static int[] solution(int N, int[] stages){
		int[] answer = {};
		answer = new int[N];
		
		List<item> list = new LinkedList<item>();
		
 		for(int i = 1; i <= N; i++){
			int stagePeople = 0;
			int challengePeople = 0;
			for(int j = 0; j < stages.length; j++){
				if(i <= stages[j]){
					stagePeople++;
					if( i == stages[j]){
						challengePeople++;
					}
				}
			}
			
			double fail = (double)challengePeople / (double)stagePeople;
			list.add(new item(i, fail));
		}
		
 		Collections.sort(list, new Comparator<item>(){
 			@Override
 			public int compare(item i1, item i2){
 				System.out.println(i1.index + " vs " + i2.index);
 				if(i1.fail > i2.fail){
 					return -1;
 				} else if(i1.fail < i2.fail){
 					return 1;
 				} else {
 					return 0;
 				}
 			}
 		});
		for(int i = 0; i < list.size(); i++){
			answer[i] = list.get(i).index;
		}
		return answer;
	}
	
	static class item {
		public int index;
		public double fail;
		public item(int i, double f){
			this.index = i;
			this.fail = f;
		}
	}
}
