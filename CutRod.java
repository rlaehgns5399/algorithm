
public class CutRod extends PrintArr{
	public CutRod(int[] arr, int n){
		int[] r = new int[arr.length];
		r[0] = arr[0];
		for(int i = 1; i <= n; i++){
			int q = -1;
			for(int j = 1; j <= i; j++){
				q = Math.max(q, arr[j] + r[i-j]);	// R_n = max(P_i + R_n-i)
			}
			r[i] = q;
		}
		super.printArr(r);
		System.out.println(r[n]);
	}
}
