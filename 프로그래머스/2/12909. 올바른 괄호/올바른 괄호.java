import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int check = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
                check++;
            }else{
                check--;
            }
            if(check < 0){
                return false;
            }
            
        }


        return check == 0;
    }
}