import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        HashMap<String, String> map = new HashMap<>();

        for (String s : record) {
            String[] parts = s.split(" ");
            if (parts.length == 3) {
                map.put(parts[1], parts[2]);
            }
        }
        List<String> answer = new ArrayList<>();
        for (String s : record) {
            String[] parts = s.split(" ");
            if (parts[0].equals("Enter")) {
                answer.add(map.get(parts[1]) + "님이 들어왔습니다.");
            } else if (parts[0].equals("Leave")) {
                answer.add(map.get(parts[1]) + "님이 나갔습니다.");
            }

        }

        return answer.toArray(new String[0]);
    }
}