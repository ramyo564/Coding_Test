import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
          while (!dq.isEmpty() && prices[dq.peekFirst()] > prices[i]) {
            int idx = dq.pollFirst();
            answer[idx] = i - idx;
          }
          dq.addFirst(i);
        }

        while (!dq.isEmpty()) {
          int idx = dq.pollFirst();
          answer[idx] = n - 1 - idx;
        }

        return answer;
    }
}