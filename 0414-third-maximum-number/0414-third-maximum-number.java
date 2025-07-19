class Solution {
    public int thirdMax(int[] nums) {
        int m1 = Integer.MIN_VALUE, m2 = Integer.MIN_VALUE, m3 = Integer.MIN_VALUE;
        boolean m1Set = false, m2Set = false, m3Set = false;

        for (int num : nums) {
            if ((m1Set && num == m1) || (m2Set && num == m2) || (m3Set && num == m3)) continue;

            if (!m1Set || num > m1) {
                m3 = m2; m3Set = m2Set;
                m2 = m1; m2Set = m1Set;
                m1 = num; m1Set = true;
            } else if (!m2Set || num > m2) {
                m3 = m2; m3Set = m2Set;
                m2 = num; m2Set = true;
            } else if (!m3Set || num > m3) {
                m3 = num; m3Set = true;
            }
        }

        return m3Set ? m3 : m1;
    }

}