import java.util.*;

public class Solution {
    public int[] solution(int []arr) { 
        int prev = -1;
        List<Integer> list = new ArrayList<>();
    
        for(int i : arr){
            if(prev == i){
                continue;
            }
            list.add(i);
            prev = i;
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}