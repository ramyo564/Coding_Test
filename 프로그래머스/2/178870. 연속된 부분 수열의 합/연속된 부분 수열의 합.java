import java.util.*;

class Solution {
    public int[] solution(int[] sequence, int k) {
        
        int r = 0;
        int l = 0;
        int temp = 0;
        int len = sequence.length;
        int[] res = new int[2];
        while(r < sequence.length){
            temp += sequence[r];
            while(temp > k){
                temp -= sequence[l++];
                
            }
            
            if(temp == k){
                if(len > r-l){
                    len = r-l;
                    res[0] = l;
                    res[1] = r;
                }
            }
            r++;
        }

        return res;
    }
}