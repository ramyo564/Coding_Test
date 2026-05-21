import java.util.*;

class Solution {
    static List<Integer>[] list;
    static boolean[] visited;
    static int V;
    public int solution(int n, int[][] wires) {
        list = new ArrayList[n + 1];

        V = n;
        for(int i = 0; i < n+1; i ++) list[i] = new ArrayList<>();    
        
        for(int[] wire : wires){
            list[wire[0]].add(wire[1]);
            list[wire[1]].add(wire[0]);
        }
        
        for(int[] wire : wires){
            int cnt1 = func(wire, n);
            int cnt2 = n - cnt1;
            V = Math.min(V, Math.abs(cnt1 - cnt2));
        }
        return V;
    }
    private int func(int[] wire, int n){
        Deque<Integer> dq = new ArrayDeque<>();
        visited = new boolean[n+1];
        int start = wire[0];
        int skip = wire[1];
        visited[start] = true;
        dq.offer(start);
        int res = 1;
        
        while(!dq.isEmpty()){
            for(int next : list[dq.poll()]){
                if(next != skip && !visited[next]){
                    visited[next] = true;
                    dq.offer(next);
                    res++;
                }
            }
        }
        return res;
    }
}