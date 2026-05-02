import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int N = speeds.length;
        Deque<Integer> dq = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < N ; i++){
            int f = progresses[i];
            int s = speeds[i];
            int remain = (int)Math.ceil((100-f) / (double)s);
            // System.out.println(remain);    
            dq.offer(remain);
        }
        // System.out.println(dq);
        while(!dq.isEmpty()){
            int temp = dq.poll();
            int cnt = 1;
            while(!dq.isEmpty() && dq.peek() <= temp){
                dq.poll();
                cnt++;
            }
            list.add(cnt);
            
        }

        return list.stream().mapToInt(i->i).toArray();
    }
}