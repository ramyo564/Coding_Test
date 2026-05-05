import java.util.*;
class Solution {
    public int solution(int x, int y, int n) {
        boolean[] visited = new boolean[y+1];
        Deque<int[]> dq = new ArrayDeque<>();
        dq.offer(new int[]{x , 0});
        visited[x] = true;
        
        while(!dq.isEmpty()){
            int[] data = dq.poll();
            int X = data[0];
            int V = data[1];
            if(X == y){
                return V;
            }
            int temp1 = X * 3;
            int temp2 = X * 2;
            int temp3 = X + n;
            if(y >= temp1 && !visited[temp1]){
                dq.offer(new int[]{temp1, V+1});
                visited[temp1] = true;
            }
            if(y >= temp2 && !visited[temp2]){
                dq.offer(new int[]{temp2, V+1});
                visited[temp2] = true;
            }
            if(y >= temp3 && !visited[temp3]){
                dq.offer(new int[]{temp3, V+1});
                visited[temp3] = true;
            }
            
            
        }
        
        int answer = -1;
        return answer;
    }
}