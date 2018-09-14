import java.util.HashSet;
import java.util.Set;

public class KaKaoCoding_1_6 extends Print{
	public KaKaoCoding_1_6(int m, int n, String[] board){
		Element[][] arr = new Element[m][n]; 
		
		for(int i = 0; i < m; i++){
			for(int j = 0; j < n; j++){
				arr[i][j] = new Element(i * m + j, String.valueOf(board[i].charAt(j)));
			}
		}
		
		
		Set<Integer> set = new HashSet<Integer>();
		int beforeSize = 0;
		int afterSize = -1;
		int result = 0;
		while(beforeSize != afterSize){
			beforeSize = getSize(arr);
			for(int i = 0; i < m-1; i++){
				for(int j = 0; j < n-1; j++){
					try{
						if(arr[i][j] != null){
							String str = arr[i][j].str;
							if(arr[i+1][j].str.equals(str) && arr[i][j+1].str.equals(str) && arr[i+1][j+1].str.equals(str)){
								set.add((i*n)+j);
								set.add(((i+1)*n)+j);
								set.add((i*n)+(j+1));
								set.add(((i+1)*n)+(j+1));
							}
						}
						
					} catch(Exception e){
						continue;
					}
					
				}
			}
			
			arrDown(arr, set, m,n);
			
			afterSize = getSize(arr);
			result += set.size();
			set = new HashSet<Integer>();
			System.out.println("block: " + result);
			
		}
	}
	private int getSize(Element[][] arr){
		int size = 0;
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				if(arr[i][j] != null) size++;
			}
		}
		return size;
	}
	private void arrDown(Element[][] arr, Set<Integer> set, int m, int n){
		for(Integer index : set){
			int i = index / n;
			int j = index % n;
			// System.out.println(index + " " + i + " " + j) ;
			arr[i][j] = null;
		}
		PrintArr(arr);
		for(int i = 0; i < m-1; i++){
			for(int j = 0; j < n; j++){
				if(arr[i][j] != null && arr[i+1][j] == null){
					arr[i+1][j] = new Element(arr[i][j].index, arr[i][j].str);
					arr[i][j] = null;
					i = 0;
					j = 0;
				}
			}
		}
		PrintArr(arr);
	}
	private void PrintArr(Element[][] arr){
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				if(arr[i][j] != null){
					System.out.print(arr[i][j].str + " ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
		System.out.println("----------");
	}
	class Element{
		public int index;
		public String str;
		public Element(int i, String s){
			this.index = i;
			this.str = s;
		}
	}
}
