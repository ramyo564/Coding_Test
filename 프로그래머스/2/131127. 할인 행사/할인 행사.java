import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        HashMap<String, Integer> wantMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }

        for (int i = 0; i <= discount.length - 10; i++) {
            HashMap<String, Integer> tenDaysMap = new HashMap<>();

            for (int j = i; j < i + 10; j++) {
                tenDaysMap.put(discount[j], tenDaysMap.getOrDefault(discount[j], 0) + 1);
            }
            
            if (wantMap.equals(tenDaysMap)) {
                answer++;
            }
        }

        return answer;
    }
}