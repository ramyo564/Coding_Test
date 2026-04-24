import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        
        int N = jobs.length;
        
        Arrays.sort(jobs, (a,b) -> a[0]-b[0]);
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[1] - b[1]);
        
        // 작업 순서
        int completedJobs = 0;
        // 작업
        int jobIdx = 0;
        // 현재 시간
        int curT = 0;
        // ans
        int ans = 0;
        
        while (completedJobs < N) {
          // 현재시간 >= 요청시간
          while (jobIdx < N && curT >= jobs[jobIdx][0]) {
            pq.offer(jobs[jobIdx++]);
          }
          if (pq.isEmpty()) {
              curT = jobs[jobIdx][0];
          } else {
            int[] data = pq.poll();
            ans += (curT - data[0]) + data[1];
            curT += data[1];
            completedJobs++;
          }
        }

        return ans / N;
    }
}