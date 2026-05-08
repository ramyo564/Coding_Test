import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        Arrays.sort(jobs, (a,b) -> a[0] - b[0]);
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[1] - b[1]);
        
        int N = jobs.length;
        int completedJobs = 0;
        int jobIdx = 0;
        int curTime = 0;
        int res = 0;
        while(completedJobs < N){
            while(jobIdx < N && curTime >= jobs[jobIdx][0]){
                pq.offer(jobs[jobIdx++]);
            }
            if(pq.isEmpty()){
                curTime = jobs[jobIdx][0];
            } else {
                int[] data = pq.poll();
                curTime += data[1];
                res += curTime - data[0];
                completedJobs++;
            }
        }
        
        return res/N;
    }
}