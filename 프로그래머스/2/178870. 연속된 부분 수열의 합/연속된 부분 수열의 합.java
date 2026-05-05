import java.util.*;
class Solution {
    public int[] solution(int[] sequence, int k) {
            int r = -1;
    int l = 0;
    int minIdx = 1000_001;
    int first = 0;
    int second = 0;

    int target = 0;
    while (r < sequence.length - 1) {
      if (target < k) {
        target += sequence[++r];
      }

      while (l <= r && target >= k) {
        if (target == k) {
          if (minIdx > r - l) {
            minIdx = r - l;
            first = l;
            second = r;
          }
          if (minIdx == 0) {
            return new int[] {l, r};
          }
        }
        target -= sequence[l++];
      }
    }

    int[] answer = new int[2];
    answer[0] = first;
    answer[1] = second;

    return answer;

    }
}