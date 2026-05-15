import java.util.*;
class Solution {
    public int[] solution(int[] sequence, int k) {
    int N = sequence.length;
    int l = 0;
    int r = 0;
    int min = N;
    int now = 0;
    int[] ans = new int[2];

    while (r < N) {
      now += sequence[r];
      while (now > k && l <= r) {
        now -= sequence[l++];
      }
      if (now == k) {
        if (min > r - l) {
          min = r - l;
          ans[0] = l;
          ans[1] = r;
        }
      }
      r++;
    }
    return ans;
    }
}