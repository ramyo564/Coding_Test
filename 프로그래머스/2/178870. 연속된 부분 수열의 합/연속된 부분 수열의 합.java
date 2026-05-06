class Solution {
    public int[] solution(int[] sequence, int k) {
        int r = -1;
        int l = 0;
        int N = sequence.length;
        int num = 0;
        int len = 1000_001;
        int[] answer = new int[2];
        while ( r < N -1 ){
            if(num < k){
                num += sequence[++r];
            }
            while(l <= r && num >= k){
                if(num == k){
                    if(len > r - l){
                        len = r - l;
                        answer[0] = l;
                        answer[1] = r;
                    }
                    if(len == 0){
                        return new int[]{l,r};
                    }
                }
                
                num -= sequence[l++];
            }
        }
        
        return answer;
    }
}