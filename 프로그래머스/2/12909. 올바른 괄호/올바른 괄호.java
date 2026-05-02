import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int n = 0;
        for(char c : s.toCharArray()){
            if(n < 0){
                return false;
            }
            if(c == '('){
                n++;
            }else{
                n--;
            }
        }
        if(n != 0){
            return false;
        }


        return answer;
    }
}