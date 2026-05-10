import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] data = new String[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            data[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(data, (a,b) -> (b+a).compareTo(a+b));
        if(data[0].equals("0")){
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for(String s : data){
            sb.append(s);
        }
        return sb.toString();
    }
}