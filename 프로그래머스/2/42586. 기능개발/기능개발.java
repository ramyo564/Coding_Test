import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        // 각 프로세스가 며칠 걸리는지 환산
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < speeds.length; i++){
            int remain = 100 - progresses[i];
            int day = (int)Math.ceil((double)remain / speeds[i]);
            q.add(day);
        }
        List<Integer> list = new ArrayList<>();
        while(!q.isEmpty()){
            int now = q.peek();
            int cnt = 0;
            while(!q.isEmpty() && now >= q.peek()){
                cnt++;
                q.poll();
            }
            list.add(cnt);
            
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}