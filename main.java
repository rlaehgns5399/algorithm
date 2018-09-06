import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class main {
	public enum Type{
		NORMAL, REVERSE, RANDOM, SUPERRANDOM
	}
	public static void main(String[] args){
		
		int[] arr = {1, 3, 6, 2, 3, 7, 2, 4, 6, 0, -1};
		new InsertionSort(arr);
		
		int[] arr2 = makeArray(100, Type.RANDOM);
		new InsertionSort(arr2);
		
		List<Integer> list1 = makeList(9, Type.REVERSE);
		new MergeSort(list1);
		
		int[] arr3 = makeArray(100, Type.REVERSE);
		new BubbleSort(arr3);
		
		int[] arr4 = makeArray(100, Type.RANDOM);
		new SelectionSort(arr4);
		
		int[] arr5 = makeArray(20, Type.RANDOM);
		new QuickSort(arr5);
		
		int[] arr6 = {0, 1, 5, 8, 9, 10, 17, 17, 20, 24, 30};
		new CutRod(arr6, 2);	// answer : 5
		new CutRod(arr6, 3);	// answer : 8	
		new CutRod(arr6, 4);	// answer : 10
		new CutRod(arr6, 7);	// answer : 18
		new CutRod(arr6, 10);	// answer : 30
	}
	private static int[] makeArray(int length, main.Type type){
		int[] arr = new int[length];
		
		for(int i = 0; i < length; i++){
			switch(type){
			case NORMAL:
				arr[i] = i;
				break;
			case REVERSE:
				arr[i] = length-i-1;
				break;
			case RANDOM:
				arr[i] = (int)(Math.random() * length);
				break;
			}
		}
		return arr;
	}
	private static List<Integer> makeList(int length, main.Type type){
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < length; i++){
			switch(type){
			case NORMAL:
				list.add(i);
				break;
			case REVERSE:
				list.add(length-i-1);
				break;
			case RANDOM:
				list.add((int)(Math.random() * length));
				break;
			}
		}
		return list;
	}
}