import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
            
        for(int i : scoville){
            pq.offer(i);
        }
        
        int cnt = 0;
        while(pq.size() > 1){
            if(pq.peek() < K){
                int first = pq.poll();
                int second = pq.poll();
                pq.offer(first + (second * 2));
                cnt++;
            }else {
                break;
            }
            
        }
        
        if(pq.peek() >= K){
            return cnt;
        }else {
            return -1;
        }
    }
}