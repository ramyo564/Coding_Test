import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int N = truck_weights.length;
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i = 0; i < bridge_length; i ++){
            dq.offer(0);
        }
        
        int idx = 0;
        int curW = 0;
        int time = 0;
        while(true){
            curW -= dq.poll();
            time++;
            if(idx < N && weight >= curW + truck_weights[idx]){
                curW += truck_weights[idx];
                dq.offer(truck_weights[idx]);
                idx++;
            } else {
                dq.offer(0);
            }
            if(curW == 0){
                break;
            }
            
        }
        return time;
    }
}