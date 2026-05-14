import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Deque<Integer> dq = new ArrayDeque<>();
        int N = speeds.length;
        
        for(int i = 0; i < N; i ++){
            int remain = 100 - progresses[i];
            dq.offer((int)Math.ceil((double)remain/speeds[i]));
        }
        List<Integer> list = new ArrayList<>();
        while(!dq.isEmpty()){
            int temp = 0;
            int curr = dq.peek();
            while(!dq.isEmpty() && dq.peek() <= curr){
                dq.poll();
                temp++;
            }
            list.add(temp);
        }
        
        return list.stream().mapToInt(i->i).toArray();
    }
}