import java.util.*;

class Solution {
    boolean solution(String s) {
        int temp = 0;
        for(char c : s.toCharArray()){
            if(temp < 0){
                return false;
            }
            if(c == '('){
                temp++;        
            }else {
                temp--;
            }
        }
        return temp == 0;
    }
}