import java.util.Arrays;

/* https://programmers.co.kr/learn/courses/30/lessons/12982
 * Input: [1,3,2,5,4]	9
 * Output: 3
 * 정렬 후 예산에서 빼면서 작으면 끝내면 끝
 */
class Solution {
  public int solution(int[] d, int budget) {
      int answer = 0;
      Arrays.sort(d);
      
      for(int i = 0; i < d.length; i++){
          if(d[i] <= budget){
              budget -= d[i];
              answer++;
          } else {
              break;
          }
      }
      return answer;
  }
}
