import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String[] s = new String[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            s[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(s, (a,b) -> (b+a).compareTo(a+b) );
        StringBuilder sb = new StringBuilder();
        for(String k : s){
            sb.append(k);
        }
        if(sb.toString().charAt(0) == '0'){
            return "0";
        }
        
        return sb.toString();
    }
}