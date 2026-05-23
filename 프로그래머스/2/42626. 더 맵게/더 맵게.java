import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : scoville){
            pq.offer(i);
        }
        int cnt = 0;
        while(pq.size() >= 2){
            if(pq.peek() >= K){
                return cnt;
            }
            int f = pq.poll();
            int s = pq.poll();
            pq.offer(f+(s*2));
            cnt++;

        }
        if(pq.peek() >= K){
            return cnt;
        }
        return -1;
    }
}