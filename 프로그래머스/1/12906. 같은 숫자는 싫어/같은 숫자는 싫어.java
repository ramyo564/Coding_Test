import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        int prev = -1;
        for(int i : arr){
            if(i == prev){
                continue;
            }
            ans.add(i);
            prev = i;
        }
        

        return ans.stream().mapToInt(i->i).toArray();
    }
}