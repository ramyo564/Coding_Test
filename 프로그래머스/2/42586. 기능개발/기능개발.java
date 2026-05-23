import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int N = speeds.length;
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i = 0; i < N; i ++){
            int remain = 100 - progresses[i];
            dq.offer((int)Math.ceil((double)remain/speeds[i]));
        }
        List<Integer> list = new ArrayList<>();
        while(!dq.isEmpty()){
            int cnt = 1;
            int now = dq.poll();
            while(!dq.isEmpty() && now >= dq.peek()){
                dq.poll();
                cnt++;
            }
            list.add(cnt);
        }
        
        return list.stream().mapToInt(i->i).toArray();
    }
}