import java.util.*;

class Solution {
    static boolean[] visited;
    static Deque<int[]> dq;
    static int x,y,n;
    public int solution(int x, int y, int n) {
        visited = new boolean[y+1];
        dq = new ArrayDeque<>();
        
        dq.offer(new int[]{x,0});
        visited[x] = true;
        
        return bfs(x,y,n);
    }
    private int bfs(int x, int y, int n){
        while(!dq.isEmpty()){
            int[] data = dq.poll();
            int temp = data[0];
            int cnt = data[1];
            
            if(temp == y){
                return cnt;
            }
            
            int temp1 = temp * 2;
            int temp2 = temp * 3;
            int temp3 = temp + n;
            
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