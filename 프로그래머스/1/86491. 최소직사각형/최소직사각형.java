import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int w = 0;
        int h = 0;
        for(int[] size : sizes){
            int temp = Math.max(size[0], size[1]);
            int min = Math.min(size[0], size[1]);
            w = Math.max(w, temp);
            h = Math.max(h, min);
            
        }
        
        return w * h;
    }
}