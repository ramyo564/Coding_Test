class Solution {
    public int[] solution(int[] sequence, int k) {
           int n = sequence.length;
           int left = 0;
           int right = 0;
           int sum = 0;
    
           int minLen = Integer.MAX_VALUE;
           int[] answer = new int[2];
    
           while (right < n) {
               sum += sequence[right];
    
               while (sum > k) {
                   sum -= sequence[left];
                   left++;
               }
    
               if (sum == k) {
                   int len = right - left + 1;
                   if (len < minLen) {
                       minLen = len;
                       answer[0] = left;
                       answer[1] = right;
                   }
               }
               right++;
           }
            return answer;
    }
}