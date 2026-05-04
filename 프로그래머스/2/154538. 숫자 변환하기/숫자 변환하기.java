import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        Deque<int[]> dq = new ArrayDeque<>();
        // bfs 초기화
        dq.offer(new int[]{x, 0});
        boolean[] visited = new boolean[y+1];
        visited[x] = true;
        
        while(!dq.isEmpty()){
            int[] temp = dq.poll();
            if(temp[0] == y){
                return temp[1];
            } else {
                if (temp[0] + n <= y && !visited[temp[0] + n]){
                    dq.offer(new int[]{temp[0] + n , temp[1] + 1});
                    visited[temp[0] + n] = true;
                }
                if (temp[0] * 2  <= y && !visited[temp[0] * 2]){
                    dq.offer(new int[]{temp[0] * 2 , temp[1] + 1});
                    visited[temp[0] * 2] = true;
                }
                if (temp[0] * 3 <= y  && !visited[temp[0] * 3]){
                    dq.offer(new int[]{temp[0] * 3 , temp[1] + 1});
                    visited[temp[0] * 3] = true;
                }
            }

            
        }
        int answer = -1;
        
        return answer;
    }
}