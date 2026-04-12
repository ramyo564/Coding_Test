import java.util.*;

class Solution {
    public int[] solution(int[] sequence, int k) {
        // l r = k?
        // 만약 같다면 가장 앞에 있는거
        // 만약 같다면 가장 짧은거
        
        // 앞에 있는건 처음부터 인덱스 돌면됨
        // 가장 짧은건 전역 상태로 관리하면됨
            int l = 0;
    int r = 0;
    int n = sequence.length;
    int temp = 0;
    int len = 1000001;
    int[] result = new int[2];
    while (r < n) {
      temp += sequence[r];
      while (k < temp) {
        temp -= sequence[l];
        l++;
      }
      if (temp == k) {
        if (l == r) {
          result[0] = l;
          result[1] = r;
          return result;
        }
        if (len > r - l) {
          len = r - l;
          result[0] = l;
          result[1] = r;
        }
      }
      r++;
    }

    return result;

    }
}