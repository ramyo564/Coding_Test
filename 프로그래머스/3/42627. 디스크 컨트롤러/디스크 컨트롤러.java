import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);

        int N = jobs.length;
        int curTime = 0;
        int jIdx = 0;
        int doneJob = 0;
        int ans = 0;
        while (doneJob < N) {
          while (jIdx < N && curTime >= jobs[jIdx][0]) {
            pq.offer(jobs[jIdx++]);
          }
          if (pq.isEmpty()) {
            curTime = jobs[jIdx][0];
          } else {
            int[] data = pq.poll();
            ans += curTime - data[0] + data[1];
            curTime += data[1];
            doneJob++;
          }
        }

        return ans / N;
    }
}