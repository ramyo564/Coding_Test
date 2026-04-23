import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        
        TreeSet<Integer> ts = new TreeSet<>();
        int[] answer = new int[2];
        
        for(String ss : operations){
            String[] s = ss.split(" ");
            int num = Integer.parseInt(s[1]);
            
            if(ss.startsWith("I")){
                ts.add(num);
            }else if (ss.equals("D -1")){
                ts.pollFirst();
            }else if (ss.equals("D 1")){
                ts.pollLast();
            }
        }
        if(ts.isEmpty()){
            return answer;
        }else {
            answer[0] = ts.last();
            answer[1] = ts.first();
        }
        return answer;
    }
}