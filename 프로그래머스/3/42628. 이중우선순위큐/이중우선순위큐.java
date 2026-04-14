import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        TreeSet<Integer> ts = new TreeSet<>();
        int[] answer = new int[2];
        
        for(String s : operations){
            String[] temp = s.split(" ");
            int n = Integer.parseInt(temp[1]);
            
            if(s.startsWith("I")){
                ts.add(n);
            }else if (s.equals("D -1")){
                if(!ts.isEmpty()){
                    ts.pollFirst();
                }
            }else if (s.equals("D 1")){
                if(!ts.isEmpty()){
                    ts.pollLast();
                }
            }
        }
        if(ts.isEmpty()){
            return answer;
        }else{
            
            answer[0] = ts.last();
            answer[1] = ts.first();
        }
        
        return answer;
    }
}