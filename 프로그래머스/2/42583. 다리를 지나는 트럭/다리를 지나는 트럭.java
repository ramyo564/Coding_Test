import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
    int N = truck_weights.length;
    // 다리모델링
    Deque<Integer> br = new ArrayDeque<>();
    for (int i = 0; i < bridge_length; i++) {
      br.push(0);
    }

    int idx = 0;
    int cur_weight = 0;
    int time = 0;

    while (!br.isEmpty()) {
      time++;
      cur_weight -= br.pollLast();
      if (idx < N && weight >= cur_weight + truck_weights[idx]) {
        br.addFirst(truck_weights[idx]);
        cur_weight += truck_weights[idx];
        idx++;
      } else if (idx == N) {
        continue;
      } else {
        br.addFirst(0);
      }
    }
    return time;
  }
}