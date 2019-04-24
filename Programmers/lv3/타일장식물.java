class Solution {
    public long solution(int N) {
        long[] dp = new long[90];
        dp[1] = 1;
        dp[2] = 1;
        for(int i = 3; i <= N+1; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return (dp[N]*2)+(dp[N+1]*2);
    }
}
