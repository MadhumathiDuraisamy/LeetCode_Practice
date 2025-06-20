class Solution {
   public int[] asteroidCollision(int[] asteroids) {
    Stack<Integer> st = new Stack<>();
    for (int val : asteroids) {
        boolean destroyed = false;
        while (!st.isEmpty() && val < 0 && st.peek() > 0) {
            int top = st.peek();
            if (top < -val) {
                st.pop();
                // continue checking because current val might destroy more
            } else if (top == -val) {
                st.pop();
                destroyed = true; // both destroyed
                break;
            } else {
                destroyed = true; // current val destroyed
                break;
            }
        }
        if (!destroyed) {
            st.push(val);
        }
    }
    int[] res = new int[st.size()];
    for (int i = st.size() - 1; i >= 0; i--) {
        res[i] = st.pop();
    }
    return res;
}

}