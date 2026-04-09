import java.util.*;

class Solution {
    public int[] solution(int[] sequence, int k) {
        // 슬라이딩 윈도우
        // 최소 길이 찾기
        
    int r = -1;
    int l = 0;
    int n = sequence.length;
    int now = 0;
    int length = 1000000;
    int[] answer = new int[2];
    while (r != n - 1) {
      now += sequence[++r];
      while (now > k) {
        now -= sequence[l++];
      }
      if (now == k && length > r - l) {
        answer = new int[] {l, r};
        length = r - l;
      }
    }
        return answer;
    }
}