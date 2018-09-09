import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class KaKaoCoding_1_5 extends Print{
	public KaKaoCoding_1_5(String str1, String str2){
		List<String> A = new ArrayList<String>();
		List<String> B = new ArrayList<String>();
		String patternSTR = "[a-zA-Z]{2}";
		Pattern pattern = Pattern.compile(patternSTR);
		
		for(int i = 0; i < str1.length() - 1; i++){
			String temp = Character.toString(str1.charAt(i)).toLowerCase() + Character.toString(str1.charAt(i+1)).toLowerCase();
			Matcher matcher = pattern.matcher(temp);
			if(matcher.find()) A.add(temp);
		}
		//super.printList(A);
		for(int i = 0; i < str2.length() - 1; i++){
			String temp = Character.toString(str2.charAt(i)).toLowerCase() + Character.toString(str2.charAt(i+1)).toLowerCase();
			Matcher matcher = pattern.matcher(temp);
			if(matcher.find()) B.add(temp);
		}
		//super.printList(B);
		
		System.out.println("A: " + str1 + ", B: " + str2);
		List<String> N = N(A,B);
		System.out.print("A n B = ");
		super.printList(N);
		List<String> U = U(A,B);
		System.out.print("A U B = ");
		super.printList(U);
		int j;
		if(N.size() == 0 || U.size() == 0){
			j = 65536;
		} else {
			double temp = ((float)N.size() / (float)U.size()) * 65536;
			j = (int)temp;
		}
		System.out.println(j);
	}
	
	// implement 1 : 
	private List<String> N(List<String> A, List<String> B){
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i = 0; i < A.size(); i++){
			for(int j = 0; j < B.size(); j++){
				if(A.get(i).equals(B.get(j))){
					if(map.get(A.get(i)) == null){
						map.put(A.get(i), 0);
					}
					map.put(A.get(i), map.get(A.get(i)) + 1);
					break;
				}
			}
		}
		
		List<String> result = new ArrayList<String>();
		for(String key : map.keySet()){
			for(int i = 0; i < map.get(key); i++){
				result.add(key);
			}
		}
		return result;
	}
	
	// implement 2 : �빐�돩留듭쓣 �궗�슜�븯�뿬 max瑜� �씠�슜�븯�뿬 �깉濡쒖슫 �빐�돩留� �깮�꽦
	private List<String> U(List<String> A, List<String> B){
		Map<String, Integer> map = new HashMap<String, Integer>();
		Map<String, Integer> map2 = new HashMap<String, Integer>();
		
		for(int i = 0; i < A.size(); i++){
			if(map.get(A.get(i)) == null) map.put(A.get(i), 0);
			map.put(A.get(i), map.get(A.get(i)) + 1);
		}
		for(int i = 0; i < B.size(); i++){
			if(map2.get(B.get(i)) == null) map2.put(B.get(i), 0);
			map2.put(B.get(i), map2.get(B.get(i)) + 1);
		}

		Map<String, Integer> resultmap = new HashMap<String, Integer>();
		for(String key : map.keySet()){
			for(String key2 : map2.keySet()){
				if(key.equals(key2)){
					resultmap.put(key, Math.max(map.get(key), map2.get(key2)));
				} else {
					resultmap.put(key, map.get(key));
					resultmap.put(key2, map2.get(key2));
				}
			}
		}
		
		List<String> result = new ArrayList<String>();
		for(String key : resultmap.keySet()){
			for(int i = 0; i < resultmap.get(key); i++){
				result.add(key);
			}
		}
		return result;
	}
	
}
