import java.util.List;

public class PrintList {
	protected void printList(List<Integer> arr){
		System.out.print("[");
		for(int i = 0; i < arr.size(); i++){
			if(i != 0){
				System.out.print(", " + arr.get(i));
			} else {
				System.out.print(arr.get(i));
			}
		}
		System.out.println("]");
	}
}
