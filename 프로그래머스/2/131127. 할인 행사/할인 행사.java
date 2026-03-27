import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        HashMap<String, Integer> wantMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }
        for (int i = 0; i < discount.length -9; i++) {
            HashMap<String, Integer> temp = new HashMap<>();
            int idx = i;
            for (int j = 0; j < 10; j++) {
                temp.put(discount[idx], temp.getOrDefault(discount[idx], 0) +1);
                idx++;
            }
            if(wantMap.equals(temp)){
                answer++;
            }
        }
        return answer;
    }
}