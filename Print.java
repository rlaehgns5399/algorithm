import java.util.List;

public class Print {
	protected void printArr(int arr[]){
		System.out.print("[");
		for(int i = 0; i < arr.length; i++){
			if(i != 0){
				System.out.print(", " + arr[i]);
			} else {
				System.out.print(arr[i]);
			}
		}
		System.out.println("]");
	}
	protected void printArr(String arr[]){
		System.out.print("[");
		for(int i = 0; i < arr.length; i++){
			if(i != 0){
				System.out.print(", " + arr[i]);
			} else {
				System.out.print(arr[i]);
			}
		}
		System.out.println("]");
	}
	protected void printList(List<?> arr){
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
	protected void printStableList(List<ISElement> list) {
		System.out.print("[");
		for(int i = 0; i < list.size(); i++){
			if(i != 0){
				System.out.print(", (" + list.get(i).index + "," + list.get(i).content +")");
			} else {
				System.out.print("(" + list.get(i).index + "," + list.get(i).content + ")");
			}
		}
		System.out.println("]");
	}
}
