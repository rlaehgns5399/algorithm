import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class main {
	public enum Type{
		NORMAL, REVERSE, RANDOM, SUPERRANDOM, RANDOM_STABLE
	}
	public static void main(String[] args){
		/**
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
		*/
		
		int[] kakao_1_1_arr1 = {9, 20, 28, 18, 11};
		int[] kakao_1_1_arr2 = {30, 1, 21, 17, 28};
		new KaKaoCoding_1_1(5, kakao_1_1_arr1, kakao_1_1_arr2);
		
		new KaKaoCoding_1_2("1S2D*3T");			//	37
		new KaKaoCoding_1_2("1D2S#10S");		//	9
		new KaKaoCoding_1_2("1D2S0T");			//	3
		new KaKaoCoding_1_2("1S*2T*3S");		//	23
		new KaKaoCoding_1_2("1D#2S*3S");		//	5
		new KaKaoCoding_1_2("1T2D3D#");			//	-4
		new KaKaoCoding_1_2("1D2S3T*");			//	59
		
		String[] KaKaoCoding_1_3_City1 = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
		new KaKaoCoding_1_3(3, KaKaoCoding_1_3_City1);		// 50
		String[] KaKaoCoding_1_3_City2 = {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"};
		new KaKaoCoding_1_3(3, KaKaoCoding_1_3_City2);		// 21
		String[] KaKaoCoding_1_3_City3 = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};
		new KaKaoCoding_1_3(2, KaKaoCoding_1_3_City3);		// 60
		String[] KaKaoCoding_1_3_City4 = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};
		new KaKaoCoding_1_3(5, KaKaoCoding_1_3_City4);		// 52
		String[] KaKaoCoding_1_3_City5 = {"Jeju", "Pangyo", "NewYork", "newyork"};
		new KaKaoCoding_1_3(2, KaKaoCoding_1_3_City5);		// 16
		String[] KaKaoCoding_1_3_City6 = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
		new KaKaoCoding_1_3(0, KaKaoCoding_1_3_City6);		// 25
		
		String[] KaKaoCoding_1_4_timeTable1 = {"08:00", "08:01", "08:02", "08:03"};
		new KaKaoCoding_1_4(1, 1, 5, KaKaoCoding_1_4_timeTable1);
		
		new KaKaoCoding_1_5("FRANCE", "french");			// 16384
		new KaKaoCoding_1_5("handshake", "shake hands");	// 65536
		new KaKaoCoding_1_5("aa1+aa2", "AAAA12");			// 43960
		new KaKaoCoding_1_5("E=M*C^2", "e=m*c^2");			// 65536
		
		List<ISElement> arr7 = makeStableList(5, Type.RANDOM_STABLE);
		new SelectionSortStable(arr7);
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
	private static List<ISElement> makeStableList(int length, main.Type type){
		List<ISElement> list = new ArrayList<ISElement>();
		
		for(int i = 0; i < length; i++){
			switch(type){
			case NORMAL:
				list.add(new ISElement(i, 0));
				break;
			case REVERSE:
				list.add(new ISElement(length - i - 1, 0));
				break;
			case RANDOM:
				list.add(new ISElement((int)Math.random()*length, 0));
				break;
			case RANDOM_STABLE:
				ISElement element = new ISElement((int)(Math.random()*length), (int)(Math.random()*length*10));
				list.add(element);
				break;
			}
		}
		return list;
	}
}