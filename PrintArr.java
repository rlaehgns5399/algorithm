
public class PrintArr {
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
}
