package Line;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q2 {

	public static void main(String[] args) throws IOException {
		final String pattern = "[a-zA-Z][0-9]*";
		Pattern p = Pattern.compile(pattern);


		try (final BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			final int n = Integer.parseInt(br.readLine());
			int[][] arr = {};
			String[][] str = new String[n][n];
			for (int i = 0; i < n; i++) {
				arr = new int[n][n];
				str[i] = br.readLine().split(" ");
			}

			for(int i = 0; i < arr.length; i++){
				for(int j = 0; j < arr[i].length; j++){
					arr[i][j] = 0;
				}
			}
			arr[0][0] = 1;

			int x = 0;
			int y = 0;
			int face = 3;		// 0 : F, 1 : R, 2: L, 3: B;
			int rx = 0;
			int ry = 0;
			while(true){
				int howmany = 0;
				String temp = new String(str[x][y]);
				howmany = Integer.parseInt(temp.replaceAll("[^0-9]", ""));
//				System.out.print(str[x][y] + "(" + x + "," + y + ") ");
//				System.out.println(howmany);
				
				rx = x;
				ry = y;
				if(face == 0){
					if(str[x][y].charAt(0) == 'F'){
						x -= howmany;
						face = 0;
					} else if(str[x][y].charAt(0) == 'R'){
						y += howmany;
						face = 1;
					} else if(str[x][y].charAt(0) == 'L'){
						y -= howmany;
						face = 2;
					} else if(str[x][y].charAt(0) == 'B'){
						x += howmany;
						face = 3;
					}
				} else if(face == 1){
					if(str[x][y].charAt(0) == 'F'){
						y += howmany;
						face = 1;
					} else if(str[x][y].charAt(0) == 'R'){
						x += howmany;
						face = 3;
					} else if(str[x][y].charAt(0) == 'L'){
						x -= howmany;
						face = 0;
					} else if(str[x][y].charAt(0) == 'B'){
						y -= howmany;
						face = 2;
					}
				} else if(face == 2){
					if(str[x][y].charAt(0) == 'F'){
						y -= howmany;
						face = 2;
					} else if(str[x][y].charAt(0) == 'R'){
						x -= howmany;
						face = 0;
					} else if(str[x][y].charAt(0) == 'L'){
						x += howmany;
						face = 3;
					} else if(str[x][y].charAt(0) == 'B'){
						y += howmany;
						face = 1;
					}
				} else if(face == 3){
					if(str[x][y].charAt(0) == 'F'){
						x += howmany;
						face = 3;
					} else if(str[x][y].charAt(0) == 'R'){
						y -= howmany;
						face = 2;
					} else if(str[x][y].charAt(0) == 'L'){
						y += howmany;
						face = 1;
					} else if(str[x][y].charAt(0) == 'B'){
						x -= howmany;
						face = 0;
					}
				}


				if(arr[x][y] == 1) {
					rx = x;
					ry = y;
					break;
				} else {
					arr[x][y] = 1;
				}
			}
			System.out.println(ry + " " + rx);
		}
	}
}

