
class Solution {
    public int[] solution(int[] sequence, int k) {
        int N = sequence.length;
        int target = 0;
        int r = 0;
        int l = 0;
        int len = N;
        
        int[] answer = new int[2];
        while(r < N){
            target += sequence[r];
            while(target > k){
                target -= sequence[l++];
            }
            if(target == k){
                if(len > r - l){
                    len = r-l;
                    answer[0] = l;
                    answer[1] = r;
                }
            }
            r++;
        }
        
        return answer;
    }
}