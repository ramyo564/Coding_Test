import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int N = scoville.length;
        int answer = 0;
        PriorityQueue <Integer> pq = new PriorityQueue <>();
        for(int i : scoville){
            pq.offer(i);
        }

        while(pq.peek() < K){
            if(pq.size() == 1){
                break;
            }
            answer++;
            int temp = pq.poll() + pq.poll() * 2;
            pq.offer(temp);
        }
        
        if(pq.peek() < K){
            return -1;
        }
        return answer;
    }
}