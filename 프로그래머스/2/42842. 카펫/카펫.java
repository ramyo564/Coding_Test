import java.util.*;
class Solution {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow;
    
        while(true){
            for(int i = 3; i < total; i++){
                if(total % i == 0){
                    int y = i;
                    int x = total/i;
                    if((y-2) * (x-2) == yellow){
                        return new int[]{x,y};
                    }
                }
            }
            break;
        }

        return null;
    }
}