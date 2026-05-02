import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> cntName = new HashMap<>();
        String answer = "";
        for(String s : participant){
            cntName.put(s, cntName.getOrDefault(s, 0) + 1);
        }
        for(String s: completion){
            cntName.put(s, cntName.get(s) - 1);
        }
        for(Map.Entry<String, Integer> entry : cntName.entrySet()){
            if(entry.getValue() != 0){
                answer = entry.getKey();
                break;
            }
        }
        
        return answer;
    }
}