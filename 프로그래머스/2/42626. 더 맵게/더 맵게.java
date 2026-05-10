import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : scoville){
            pq.offer(i);
        }
        int res = 0;
        while(pq.size() > 1){
            if(pq.peek() >= K){
                break;
            }
            int f = pq.poll();
            int s = pq.poll();
            int temp = f + (s * 2);
            pq.offer(temp);
            res++;
        }
        if(pq.peek() < K){
            return -1;
        }

        return res;
    }
}