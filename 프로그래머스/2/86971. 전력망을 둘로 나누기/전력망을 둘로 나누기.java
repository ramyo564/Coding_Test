import java.util.*;
class Solution {
    static ArrayList<Integer>[] list;
    public int solution(int n, int[][] wires) {
        list = new ArrayList[n+1];
        
        for(int i = 1; i <= n; i++){
            list[i] = new ArrayList<>();
        }
        
        for(int[] wire : wires){
            list[wire[0]].add(wire[1]);
            list[wire[1]].add(wire[0]);
        }
        
        int midN = n;
        for(int[] wire : wires){
            int cnt1 = bfs(wire, n);
            int cnt2 = n - cnt1;
            midN = Math.min(midN, Math.abs(cnt1-cnt2));
        }
    
        
        return midN;
    }
    private int bfs(int[]wire , int n){
        boolean[] visited = new boolean[n+1];
        Deque<Integer> dq = new ArrayDeque<>();

        int start = wire[0];
        int skip = wire[1];
        dq.offer(start);
        visited[start] = true;
        int cnt = 1;
        while(!dq.isEmpty()){
            int curr = dq.poll();
            for(int next : list[curr]){
                if(next != skip && !visited[next]){
                    visited[next] = true;
                    cnt++;
                    dq.offer(next);
                }
            }
        }
        return cnt;
    }
}