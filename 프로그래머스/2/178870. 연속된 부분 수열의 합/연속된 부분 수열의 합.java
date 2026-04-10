class Solution {
    public int[] solution(int[] sequence, int k) {
    int n = sequence.length;
    int r = 0;
    int l = 0;
    int sum = 0;
    int size = 1000001;
    int[] answer = new int[2];

    while (r < n) {
      sum += sequence[r];
      while (sum > k) {
        sum -= sequence[l++];
      }
      if (k == sum) {
        if (size > r - l) {
          size = r - l;
          answer[0] = l;
          answer[1] = r;
        }
        if (l == r) {
          return answer;
        }
      }
      r++;
    }
        
        
        return answer;
    }
}