import java.util.*;
class Solution {
    public int solution(int x, int y, int n) {
        
        Deque<int[]> dq = new ArrayDeque<>();
        boolean[] visited = new boolean[y+1];
        dq.offer(new int[]{x, 0});
        visited[x] = true;
        while(!dq.isEmpty()){
            int[] data = dq.poll();
            int num = data[0];
            int cnt = data[1];
            if(num == y){
                return cnt;
            }
            int temp1 = num * 2;
            int temp2 = num * 3;
            int temp3 = num + n;
            if(temp1 <= y && !visited[temp1]){
                visited[temp1] = true;
                dq.offer(new int[]{temp1, cnt + 1});
            }
            if(temp2 <= y && !visited[temp2]){
                visited[temp2] = true;
                dq.offer(new int[]{temp2, cnt + 1});
            }
            if(temp3 <= y && !visited[temp3]){
                visited[temp3] = true;
                dq.offer(new int[]{temp3, cnt + 1});
            }
        }
        
        
        return -1;
    }
}