import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i = 0; i < bridge_length; i++){
            dq.offer(0);
        }
        int N = truck_weights.length;
        int curW = 0;
        int tIdx = 0;
        int time = 0;
        while(true){
            curW -= dq.poll();
            time++;
            if(tIdx < N && curW + truck_weights[tIdx] <= weight){
                int truckW = truck_weights[tIdx];
                curW += truckW;
                dq.offer(truckW);
                tIdx++;
            }else {
                dq.offer(0);
            }
            if(curW == 0 && tIdx == N){
                break;
            }
            
            
        }

        return time;
    }
}