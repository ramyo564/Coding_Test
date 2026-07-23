import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int total = yellow + brown;
        
        while(true){
            for(int i = 3; i < total; i++){
                int y = i;
                int x = total / y;
                if (x >= y && (x-2) * (y-2) == yellow){
                    return new int[]{x,y};
                }
            }
            break;
        }
        int[] answer = {};
        
        return answer;
    }
}