import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        int N = numbers.length;
        String[] st = new String[N];
        for(int i = 0; i < N; i++){
            st[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(st, (a,b) -> (b+a).compareTo(a+b));
        
        if(st[0].equals("0")){
            return "0";
        }
        
        StringBuilder sb = new StringBuilder();
        for (String s : st) {
          sb.append(s);
        }

        return sb.toString();
    }
}