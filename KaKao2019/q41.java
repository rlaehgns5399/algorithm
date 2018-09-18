package KaKao2019;
import java.util.LinkedList;
import java.util.Queue;

public class q41 {

	public static void main(String[] args) {
		int[] d = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		System.out.println("\n" + solution(d,5));

	}
	public static  int solution(int[] food_times, long k){
		int answer = 0;
		int counter = 1;
		Queue<item> queue = new LinkedList<item>();
		for(int i = 0; i < food_times.length; i++){
			if(food_times[i] != 0) queue.offer(new item(i+1, food_times[i]));
		}
		
		while(counter <= k && !queue.isEmpty()){
			item element = queue.peek();
			print(queue);
			if(element.remain > 1){
				
				queue.offer(new item(element.index, element.remain-1));
				queue.poll();
				
			} else {
				queue.poll();
			}
			print(queue);
			System.out.println();
			counter++;
		}
		if(queue.isEmpty()) return -1;
		
		answer = queue.peek().index;
		
		return answer;
	}
	private static void print(Queue<item> q){
		for(item a : q){
			System.out.print(a.index + "(" + a.remain + ") ");
		}
	}
	static class item{
		int index;
		int remain;
		public item(int index, int remain){
			this.index = index;
			this.remain= remain;
		}
	}
}