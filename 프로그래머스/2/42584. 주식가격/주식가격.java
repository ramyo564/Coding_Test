import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        Deque<Integer> dq = new ArrayDeque<>();
        int[] ans = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
          // 1 2 3 2 3
          // 0 1 2 3 4
          while (!dq.isEmpty() && prices[dq.peek()] > prices[i]) {
            int idx = dq.pop();
            ans[idx] = i - idx;
          }
          dq.push(i);
        }

        while (!dq.isEmpty()) {
          int idx = dq.pop();
          ans[idx] = prices.length - idx - 1;
        }
        return ans;
    }
}