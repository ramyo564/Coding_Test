import java.util.*;

class Solution {
    static List<Integer>[] list;
    static boolean[] visited;
    public int solution(int n, int[][] wires) {
        list = new ArrayList[n+1];
        for(int i = 0; i <= n; i++){
            list[i] = new ArrayList<>();
        }
        for(int[] wire : wires){
            list[wire[0]].add(wire[1]);
            list[wire[1]].add(wire[0]);
        }
        int min = n;
        for(int[] wire : wires){
            int cnt1 = bfs(wire, n);
            int cnt2 = n - cnt1;
            min = Math.min(min, Math.abs(cnt1-cnt2));
        }
        
        
        return min;
    }
    static int bfs(int[] wire, int n){
        Deque<Integer> dq = new ArrayDeque<>();
        visited = new boolean[n+1];
        int curr = wire[0];
        int skip = wire[1];
        dq.offer(curr);
        visited[curr] = true;
        int res = 1;
        while(!dq.isEmpty()){
            for(int next : list[dq.poll()]){
                if(next != skip && !visited[next]){    
                    dq.offer(next);
                    visited[next]=true;
                    res++;
                }        
            }
        }
        return res;
    }
}