class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        final int MOD = 1_000_000_007;
        long[] dp = new long[n + 1];  // dp[i] = number of people who learn the secret on day i
        dp[1] = 1;  // Day 1: one person knows the secret
        long share = 0; // number of people who can share the secret

        for (int day = 2; day <= n; day++) {
            // People start sharing after "delay" days
            if (day - delay >= 1) {
                share = (share + dp[day - delay]) % MOD;
            }
            // People forget after "forget" days
            if (day - forget >= 1) {
                share = (share - dp[day - forget] + MOD) % MOD;
            }
            dp[day] = share; // new people who learn on this day
        }

        // Count people who still remember on day n
        long result = 0;
        for (int i = n - forget + 1; i <= n; i++) {
            if (i > 0) {
                result = (result + dp[i]) % MOD;
            }
        }

        return (int) result;
    }
}