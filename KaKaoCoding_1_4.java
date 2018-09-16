import java.util.Arrays;

public class KaKaoCoding_1_4 {
	public KaKaoCoding_1_4(int n, int t, int m, String[] tt){
		int[] intTT = new int[tt.length+1];
		for(int i = 0; i < intTT.length; i++) intTT[i] = intTime(tt[i]);
		Arrays.sort(intTT);
		
		
		int driveTime = 540;
		int checkCrew = 0;
		int conTime = 0;
		for(int i = 0; i < n; i++){
			int shuttleSeat = m;
			for(int j = checkCrew; j < tt.length; j++){
				if(intTT[j] <= driveTime){
					shuttleSeat--;
					checkCrew++;
					if(shuttleSeat == 0) break;
				}
			}
			
			if(i == n - 1){
				if(shuttleSeat == 0) conTime = intTT[checkCrew - 1] - 1;
				else conTime = driveTime;
			}
			
			driveTime += t;
			if(driveTime >= (60*24)) break;
		}
		
		System.out.println(strTime(conTime));
	}
	private int intTime(String str){
		String[] time = str.split(":");
		int hour = Integer.parseInt(time[0]);
		int min = Integer.parseInt(time[1]);
		return hour * 60 + min;
	}
	private String strTime(int integer){
		int hour = integer / 60;
		int min = integer % 60;
		String result = "";
		if(hour < 10) {
			result = "0" + hour + ":";
		} else {
			result = "" + hour + ":";
		}
		
		if(min < 10){
			result = result + "0" + min;
		} else {
			result = result + "" + min;
		}
		return result;
	}
}
