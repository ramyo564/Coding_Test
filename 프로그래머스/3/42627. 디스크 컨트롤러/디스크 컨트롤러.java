import java.util.*; 

class Solution {
    public int solution(int[][] jobs) {
        Arrays.sort(jobs, (a,b)-> a[0] - b[0]);
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> a[1] - b[1]);
        int len = jobs.length;
        int jIdx = 0;
        int done = 0;
        int curTime = 0;
        int res = 0;
        
        while(done < len){
            while(jIdx < len && curTime >= jobs[jIdx][0]){
                pq.offer(jobs[jIdx++]);
            }
            if(pq.isEmpty()){
                curTime = jobs[jIdx][0];
            }
            else{
                int[] now = pq.poll();
                curTime += now[1];
                res += curTime - now[0];
                done++;
            }
        }
        
        return res/len;
    }
}