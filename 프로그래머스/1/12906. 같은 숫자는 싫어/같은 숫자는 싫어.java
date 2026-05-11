import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        
        int prev = -1;
        
        for(int i : arr){
            if(i != prev){
                list.add(i);
                prev = i;
            }
        }
        
        
        return list.stream().mapToInt(i->i).toArray();
    }
}