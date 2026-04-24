import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
        int N = operations.length;
        
        TreeSet<Integer> ts = new TreeSet<>();

        for(String s : operations){
            String[] data = s.split(" ");
            int num = Integer.parseInt(data[1]);
            
            if(s.startsWith("I")){
                ts.add(num);
            }else if(s.equals("D -1")){
                if(!ts.isEmpty()){
                    ts.pollFirst();
                }
            }else if(s.equals("D 1")){
                if(!ts.isEmpty()){
                    ts.pollLast();
                }
            }
        }
        
        int[] answer = {0,0};
        
        if(!ts.isEmpty()){
            answer[1] = ts.first();
            answer[0] = ts.last();
        }
        return answer;
    }
}