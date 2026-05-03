import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        
        int N = bridge_length;
        int M = truck_weights.length;
        Deque<Integer> bridgeDq = new ArrayDeque<>();
        // 다리 초기화
        for(int i = 0; i < N; i ++){
            bridgeDq.offer(0);
        }
        
        int idx = 0;
        int curW = 0;
        int time = 0;
        while(true){
            // 트럭 진입 가능
            curW -= bridgeDq.poll();
            if(idx < M && curW + truck_weights[idx] <= weight){
                bridgeDq.offer(truck_weights[idx]);
                curW += truck_weights[idx];
                idx++;
            }
            // 트럭 진입 불가
            else {
                bridgeDq.offer(0);
            }
            time++;
            if(idx == M && curW == 0){
                break;
            }

        }
        

        return time;
    }
}