class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
         int n = temperatures.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>(); // stack stores indices

        for (int i = 0; i < n; i++) {
            // While current temperature is warmer than temperature at stack's top index
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prevIndex = stack.pop();
                answer[prevIndex] = i - prevIndex;  // Calculate the number of days waited
            }
            stack.push(i);
        }
        
        // For indices that never found a warmer day, answer[i] stays 0 by default
        return answer;
    }
}