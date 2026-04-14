import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
            // 다리 모델링
    Deque<Integer> bg = new ArrayDeque<>();
    for (int i = 0; i < bridge_length; i++) {
      bg.push(0);
    }

    // 전역 상태 값
    int time = 0;
    int cur_wt = 0;
    // 트럭 인덱스
    int idx = 0;

    // 다리는 무게만 체크
    while (true) {
      cur_wt -= bg.poll();
      time++;
      if (idx < truck_weights.length && weight >= cur_wt + truck_weights[idx]) {
        bg.offer(truck_weights[idx]);
        cur_wt += truck_weights[idx];
        idx++;
      } else {
        bg.offer(0);
      }

      if (cur_wt == 0) {
        return time;
      }
    } 
        
    }
}