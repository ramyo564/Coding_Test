import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(arr[0]);
        for (int i : arr){
            if(dq.peekLast() == i){
                continue;
            }
            dq.addLast(i);
        }

        return dq.stream().mapToInt(Integer::intValue).toArray();
    }
}