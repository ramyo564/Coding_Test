import java.util.*;

class Solution {
    static int maxCount = 0;
    static boolean[] visited;
    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        dfs(k, dungeons, 0);
        return maxCount;
    }
    static void dfs(int k, int[][] dungeons, int cnt){
        for(int i = 0; i < dungeons.length; i++){
            if(!visited[i] && dungeons[i][0] <= k){
                visited[i] = true;
                dfs(k - dungeons[i][1] ,dungeons, cnt + 1);
                visited[i] = false;
            }
        }
        maxCount = Math.max(maxCount, cnt);
    }
}