class Solution {
    public int[] solution(int[] sequence, int k) {
        int N = sequence.length;
        int r = 0;
        int l = 0;
        int total = 0;
        int len = N;
        int[] ans = new int[]{N,N};
        while(r < N){
            total += sequence[r];
            while(l <= r && total > k){
                total -= sequence[l++];
            }
            
            if(total == k){
                if(len > r-l){
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