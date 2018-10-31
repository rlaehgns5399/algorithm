import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

public class LG_CNS_2 {

	public static void main(String[] args) {
		
		int N =3;
		int[][] house = {{0,0}, {1,0}};
		int answer = 0;
        
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        for(int q = 0; q < house.length; q++){
        	int origin_x = house[q][0];
        	int origin_y = house[q][1];

            for(int i = -100; i <= 100; i++){
                for(int j = -100; j <= 100; j++){
                	
                	if(map.get(i + " " + j) == null){
                		map.put(i + " " +j, getdist(i, j, origin_x, origin_y));
                	} else {
                		if(map.get(i + " " + j) < getdist(i, j, origin_x, origin_y)){
                			map.put(i + " " +j, getdist(i, j, origin_x, origin_y));
                		}
                	}
                }
            }
        }
        
        
        List<String> list = new ArrayList<String>();
        list.addAll(map.keySet());
        
        Collections.sort(list, new Comparator(){

			@Override
			public int compare(Object o1, Object o2) {
				Object v1 = map.get(o1);
				Object v2 = map.get(o2);

				return ((Comparable) v2).compareTo(v1);
			}
        	
        });
        
        List<Point> answer_array = new ArrayList<Point>();
        for(int i = 0; i < N; i++){
        	String[] str = list.get(i).split(" ");
        	Point item = new Point(Integer.parseInt(str[0]), Integer.parseInt(str[1]), map.get(list.get(i)));
        	answer_array.add(item);
        }
        
        answer = Integer.MAX_VALUE;
        for(int i = 0; i < house.length; i++){
        	for(int j = 0; j < answer_array.size(); j++){
        		if(answer > getdist2(house[i][0], house[i][1], answer_array.get(j).x, answer_array.get(j).y)){
        			answer = getdist2(house[i][0], house[i][1], answer_array.get(j).x, answer_array.get(j).y);
        		}
        	}
        }
        
//        System.out.println(answer);
//        
//        for(String s : map.keySet()){
//        	if(map.get(s) == 142 || map.get(s)== 141)
//        	System.out.println(s + ": " + map.get(s));
//        }
//        System.out.println();
//        for(int i = 0; i < 10; i++){
//        	System.out.println(list.get(i) + " " + map.get(list.get(i)));
//        }
        	
	}
	
	public static int getdist(int x, int y, int ox, int oy){
		return (int)Math.sqrt(Math.pow(ox - x, 2) + Math.pow(oy - y, 2));
	}
	public static int getdist2(int x, int y, int ox, int oy){
		return (int)(Math.pow(ox - x, 2) + Math.pow(oy - y, 2));
	}
    static class Point{
        public int x, y, dist;
        public Point(int x, int y, int dist){
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }
}
