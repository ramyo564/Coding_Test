import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] sNum = new String[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            sNum[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(sNum, (a,b) -> (b+a).compareTo(a+b));
        StringBuilder sb = new StringBuilder();
        for(String s : sNum){
            sb.append(s);
        }
        String rt = sb.toString();
        if(rt.startsWith("0")){
            return "0";
        }
        
        return sb.toString();
    }
}