import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        TreeSet<Integer> ts = new TreeSet<>();
        
        for(String s : operations){
            String[] data = s.split(" ");
            if(s.startsWith("I")){
                ts.add(Integer.parseInt(data[1]));
            }else if(s.equals("D 1")){
                if(!ts.isEmpty()){
                    ts.pollLast();
                }
            }else {
                if(!ts.isEmpty()){
                    ts.pollFirst();
                }
            }
        }
        int[] answer = new int[]{0,0};
        if(!ts.isEmpty()){
            answer[0] = ts.last();
            answer[1] = ts.first();
            
        }
        return answer;
    }
}