class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int cnt = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
                cnt++;
                continue;
            }
            cnt --;

            if(cnt < 0){
                break;
            }
        }

        return cnt == 0;
    }
}