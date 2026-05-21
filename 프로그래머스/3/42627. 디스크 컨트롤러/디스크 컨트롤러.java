import java.util.*;
class Solution {
    public int solution(int[][] jobs) {
        Arrays.sort(jobs, (a,b)-> a[0] - b[0]);
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> a[1] - b[1]);
        
        int N = jobs.length;
        int doneJ = 0;
        int idx = 0;
        int curTime  = 0;
        int res = 0;
        
        while(doneJ < N){
            while(idx < N && curTime >= jobs[idx][0]){
                pq.offer(jobs[idx]);
                idx++;
            }
            if(pq.isEmpty()){
                curTime = jobs[idx][0];
            } else {
                int[] data = pq.poll();
                curTime += data[1];
                res += curTime - data[0];
                doneJ ++;
                
            }
            
        }
        return res / N;
    }
}