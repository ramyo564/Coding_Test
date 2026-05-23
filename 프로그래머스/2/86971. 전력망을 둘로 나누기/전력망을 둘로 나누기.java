import java.util.*;

class Solution {
    static List<Integer>[] list;
    static boolean[] visited;
    public int solution(int n, int[][] wires) {
        list = new ArrayList[n+1];
        for (int i = 0; i <= n; i ++){
            list[i] = new ArrayList<>();
        }
        for(int[] wire : wires){
            list[wire[0]].add(wire[1]);
            list[wire[1]].add(wire[0]);
        }
        int res = n;
        for(int[] wire : wires){
            int cnt1 = bfs(wire, n);
            int cnt2 = n - cnt1;
            res = Math.min(res, Math.abs(cnt1-cnt2));
        }
        
        return res;
    }
    private int bfs(int[] wire, int n){
        Deque<Integer> dq = new ArrayDeque<>();
        visited = new boolean[n+1];
        int start = wire[0];
        int skip = wire[1];
        visited[start] = true;
        dq.offer(start);
        int cnt = 1;
        while(!dq.isEmpty()){
            int curr = dq.poll();
            for(int next : list[curr]){
                if(next != skip && !visited[next]){
                    dq.offer(next);
                    visited[next] = true;
                    cnt++;
                }
            }
        }
        
        return cnt;
    }
}