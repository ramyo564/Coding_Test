import java.util.*;

class Solution {
    static boolean[] visited;
    static int max = 0;
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        dfs(dungeons, k, 0);
        
        return max;
    }
    
    static void dfs(int[][] dun, int k, int cnt){

        for (int i = 0; i < dun.length; i++){
            int need = dun[i][0];
            int spend = dun[i][1];
            if(!visited[i] && k >= need){
                visited[i] = true;
                dfs(dun, k-spend, cnt + 1);
                visited[i] = false;
            }
        }
        max = Math.max(max, cnt);
    }
}