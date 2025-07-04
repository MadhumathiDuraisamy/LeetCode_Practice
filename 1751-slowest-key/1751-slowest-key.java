class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int maxDuration = releaseTimes[0]; // duration of first key
        char slowestKey = keysPressed.charAt(0); // first key

        for (int i = 1; i < releaseTimes.length; i++) {
            int duration = releaseTimes[i] - releaseTimes[i - 1];

            if (duration > maxDuration || (duration == maxDuration && keysPressed.charAt(i) > slowestKey)) {
                maxDuration = duration;
                slowestKey = keysPressed.charAt(i);
            }
        }

        return slowestKey;
    }
}
