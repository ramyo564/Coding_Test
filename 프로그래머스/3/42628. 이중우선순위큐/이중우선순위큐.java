import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        TreeSet<Integer> ts = new TreeSet<>();
        for(int i = 0; i < operations.length; i++){
            String data = operations[i];
            String num = data.split(" ")[1];
            if(data.startsWith("I")){
                ts.add(Integer.parseInt(num));
            }else if(data.equals("D -1")){
                if(!ts.isEmpty()){
                    ts.pollFirst();
                }
            }else{
                if(!ts.isEmpty()){
                    ts.pollLast();
                }
            }
            
            
        }
        if(!ts.isEmpty()){
            return new int[]{ts.last(),ts.first()};
        }
        return new int[]{0,0};
    }
}