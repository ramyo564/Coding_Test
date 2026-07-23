import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int max = 0;
        int min = 0;
        for (int i = 0; i < sizes.length; i++){
            int w = sizes[i][0];
            int h = sizes[i][1];
            
            max = Math.max(max, Math.max(w,h));
            min = Math.max(min, Math.min(w,h));
            
        }
        int answer = min * max;
        return answer;
    }
}