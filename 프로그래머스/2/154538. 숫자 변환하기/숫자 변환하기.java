import java.util.*;
class Solution {
    public int solution(int x, int y, int n) {
        boolean[] visited = new boolean[y+1];
        Deque<int[]> dq = new ArrayDeque<>();
        dq.offer(new int[]{x, 0});
        while(!dq.isEmpty()){
            int[] data = dq.poll();
            int curr = data[0];
            int cnt = data[1];
            if(curr == y){
                return cnt;
            }
            int temp1 = curr*2;
            int temp2 = curr*3;
            int temp3 = curr+n;
            if(temp1 <= y && !visited[temp1]){
                visited[temp1] = true;
                dq.offer(new int[]{temp1, cnt+1});
            }
            if(temp2 <= y && !visited[temp2]){
                visited[temp2] = true;
                dq.offer(new int[]{temp2, cnt+1});
            }
            if(temp3 <= y && !visited[temp3]){
                visited[temp3] = true;
                dq.offer(new int[]{temp3, cnt+1});
            }
        }
        
        return -1;
    }
}