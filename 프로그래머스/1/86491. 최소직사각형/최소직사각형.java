import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int maxY = 0;
        int maxX = 0;
        
        for(int[] size : sizes){
            int tempA = Math.max(size[1], size[0]);
            int tempB = Math.min(size[1], size[0]);
            maxY = Math.max(tempA, maxY);
            maxX = Math.max(tempB, maxX);
        }
        
        
        return maxY*maxX;
    }
}