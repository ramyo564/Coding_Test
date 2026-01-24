import java.util.*;
public class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < bridge_length; i++) {
            q.add(0);
        }

        int time = 0;
        int truck_idx = 0;
        int curWeight = 0;

        while (true) {
            curWeight -= q.poll();

            if (truck_idx < truck_weights.length && curWeight + truck_weights[truck_idx] <= weight) {
                q.add(truck_weights[truck_idx]);
                curWeight += truck_weights[truck_idx];
                truck_idx++;
            }

            else {
                q.add(0);
            }

            time++;

            if (curWeight == 0 && truck_idx == truck_weights.length) {
                break;
            }
        }

        return time;
    }
}