import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i : scoville){
            pq.offer(i);
        }
        
        int cnt = 0;
        while(pq.peek() < K){
            if(pq.size() < 2){
                break;
            }
            int fst = pq.poll();
            int sec = pq.poll();
            pq.offer(fst + (sec * 2));
            cnt++;
        }
        if(pq.peek() >= K){
            return cnt;
        }else {
            return -1;
        }

    }
}