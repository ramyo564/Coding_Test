class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int prev = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
                prev ++;
            }else {
                prev --;
            }
            if(prev < 0){
                return false;
            }
        }

        return prev == 0;
    }
}