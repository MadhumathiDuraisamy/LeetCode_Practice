class Solution {
    public int minBitFlips(int start, int goal) {
        int xor = start ^ goal; // XOR gives 1 for bits that differ
        int count = 0;
        while (xor != 0) {
            count += xor & 1; // count set bits
            xor >>= 1;        // right shift
        }
        return count;
    }
}
