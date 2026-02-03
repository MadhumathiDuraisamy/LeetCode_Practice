class Solution {
    public int countPrimes(int n) {
        boolean[] prime = new boolean[n];
        for (int i = 0; i < n; i++) {
            prime[i] = true;
        }
 
        for (int p = 2; p * p < n; p++) {
            if (prime[p]) {
                // marking as false
                for (int i = p * p; i < n; i += p)
                    prime[i] = false;
            }
        }
 
        // Count number of primes
        int count = 0;
        for (int p = 2; p < n; p++) {
            if (prime[p])
                count++;
        }
        return count;
    }
}