
class Solution {
    public int[] solution(int[] sequence, int k) {
        
        int N = sequence.length;
        int r = 0;
        int l = 0;
        int len = N;
        int total = 0;
        int[] ans = new int[2];
        while(r < N){
            total += sequence[r];
            while(l < N && total > k){
                total -= sequence[l++];
            }
            if(total == k){
                if(len > r - l){
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