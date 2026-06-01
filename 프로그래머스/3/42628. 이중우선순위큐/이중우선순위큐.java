import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        TreeSet<Integer> ts = new TreeSet<>();
        
        for(String op : operations){
            String[] data = op.split(" ");
            if(op.startsWith("I")){

                    ts.add(Integer.parseInt(data[1]));
                
            }
            else if(op.equals("D 1")){
                if(!ts.isEmpty()){
                    ts.pollLast();
                }
            }else if(op.equals("D -1")){
                if(!ts.isEmpty()){
                    ts.pollFirst();
                }
            }
        }
        int[] res = new int[2];
        
        if(ts.isEmpty()){
            return res;
        }
        else {
            res[0]=ts.last();
            res[1]=ts.first();
            return res;
        }
    }
}