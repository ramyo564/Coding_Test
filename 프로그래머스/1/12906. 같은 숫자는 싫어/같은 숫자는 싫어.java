import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};

        if (arr.length == 0){
            return answer;
        }

        Deque<Integer> dq = new ArrayDeque<>();
        dq.push(arr[0]);

        for (int i = 1; i < arr.length; i++){
            int now = arr[i];
            int last_deque = dq.peekLast();
            if(last_deque != now){
                dq.addLast(arr[i]);
            }
        }
        ArrayList<Integer> arrayList = new ArrayList<>(dq);
        return arrayList.stream().mapToInt(Integer::intValue).toArray();
    }
}