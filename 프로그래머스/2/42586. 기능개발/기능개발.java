import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < speeds.length; i++){
   int dayLeft = (int) Math.ceil((double) (100 - progresses[i]) / speeds[i]);
            q.add(dayLeft);
            
        }
        
        List<Integer> list = new ArrayList<>();
        int cnt = 0;
        while(!q.isEmpty()){
            int target = q.peek();
            q.poll();
            cnt ++;
            while (!q.isEmpty() && target >= q.peek()){
                q.poll();
                cnt++; 
            }
            list.add(cnt);
            cnt = 0;
        }
        
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}