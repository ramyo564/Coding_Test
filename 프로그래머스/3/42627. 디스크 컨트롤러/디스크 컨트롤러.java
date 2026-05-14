import java.util.*;
class Solution {
    public int solution(int[][] jobs) {
        Arrays.sort(jobs, (a,b) -> a[0] - b[0]);
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> a[1] - b[1]);
        
        int N = jobs.length;
        int jIdx = 0;
        int curT = 0;
        int doneJ = 0;
        int ansT = 0;
        
        while(doneJ < N){

            while(jIdx < N && curT >= jobs[jIdx][0]){
                pq.offer(new int[] {jobs[jIdx][0], jobs[jIdx][1]});
                jIdx++;
            }
            if(pq.isEmpty()){
                curT = jobs[jIdx][0];
            }
            else{
                int[] data = pq.poll();
                curT += data[1];
                ansT += curT - data[0];
                doneJ++;
            }
            
        }

        return ansT/N;
    }
}