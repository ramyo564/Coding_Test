import java.util.*;

class Solution {
    public int[] solution(int[] sequence, int k) {
        int N = sequence.length;
        
        // 상태관리
        // 현재 값 
        int now = 0;
        // idx 
        int l = 0;
        int r = 0;
        // 최소값
        int len = 1000001;
        
        int[] ans = new int[2];
        
        while (r < N) {
          now += sequence[r];
          while (now > k && l < r) {
            now -= sequence[l++];
          }
          if (now == k) {
            if (len > r - l) {
              len = r - l;
              ans[0] = l;
              ans[1] = r;
            }
          }
          r++;
        }
        
        return ans;
    }
}