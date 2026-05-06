import java.util.*;
class Solution {
    public int[] solution(int[] sequence, int k) {
        int l = 0;
        int r = -1;
        int N = sequence.length;
        int target = 0;
        int len = 1000_001;
        int[] answer = new int[2];
        while(r < N-1){
            if(target < k){
                target += sequence[++r];
            }

            while(l <= r && target >= k){
                if(target == k){
                    if(len > r - l){
                        len = r - l;
                        answer[0] = l;
                        answer[1] = r;
                    }
                    if (r - l == 0){
                    return new int[]{l,r};
                    }
                }
                target -= sequence[l++];

            }
        }
        
        return answer;
    }
}