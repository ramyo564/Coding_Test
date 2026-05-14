import java.util.*;
class Solution {
    Set<Integer> set = new HashSet<>();
    public int[] solution(int brown, int yellow) {
        int sq = brown + yellow;
        int temp = brown + yellow;
        while (temp > 0){
            if(!set.contains(temp) && sq % temp == 0){
                set.add(sq/temp);
                set.add(temp);
            }
            temp--;
        }
        int X = 0;
        int Y = 0;
        for(int i : set){
            int K = sq / i;
            if((K-2) * (i-2) == yellow) {
                X = K;
                Y = i;
                break;
            }
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(X);
        list.add(Y);
        list.sort((a,b)-> b-a);
        
        return list.stream().mapToInt(i->i).toArray();
    }
}