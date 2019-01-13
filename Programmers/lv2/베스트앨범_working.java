import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class 베스트앨범 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] genres = { "classic", "pop", "classic", "classic", "pop" };
		int[] plays = { 500, 600, 150, 800, 2500 };
		
		System.out.println(Arrays.toString(solution(genres, plays)));
	}
	public static int[] solution(String[] genres, int[] plays) {
		int[] answer = {};
		HashMap<String, LinkedList<item>> map = new HashMap<>();
		for(int i = 0; i < genres.length; i++) {
			item item = new item();
			item.index = i;
			item.value = plays[i];
			if(map.get(genres[i]) == null) {
				map.put(genres[i], new LinkedList<item>());
			}
			map.get(genres[i]).add(item);
		}
		return answer;
	}
	
	public static class item implements Comparable<item>{
		public int index;
		public int value;
		@Override
		public int compareTo(item arg0) {
			if(arg0.index > this.index) {
				return arg0.value - this.value;
			} 
			else {
				return arg0.value - this.value;
			}
		}
	}
}
