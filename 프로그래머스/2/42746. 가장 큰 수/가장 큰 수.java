import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        
        int N = numbers.length;
        String[] sNum = new String[N];
        
        for (int i = 0; i < N; i ++){
            sNum[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(sNum, (a,b) -> (b+a).compareTo(a+b));
        if(sNum[0].equals("0")){
            return "0";
        }
        
        StringBuilder sb = new StringBuilder();
        for(String s : sNum){
            sb.append(s);
        }
        
        return sb.toString();
    }
}