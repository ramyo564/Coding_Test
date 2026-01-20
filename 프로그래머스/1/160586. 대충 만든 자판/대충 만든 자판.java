
import java.util.HashMap;
class Solution {
    // TODO: 프로그래머스에서 복사한 메서드 시그니처로 교체
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];

        // 1. 키맵 해시맵으로 만들기
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < keymap.length; i++) {
            if(!keymap[i].isEmpty()){
                for (int r = 0; r < keymap[i].length(); r++) {
                    char c = keymap[i].charAt(r);
                    if (map.containsKey(c) && map.get(c) < r + 1) {
                        continue;
                    } else {
                        map.put(c, r + 1);
                    }
                }
            }

        }
        System.out.println(map);
        // 2. 해시맵 키가 타겟에 있는지 확인하기
        for (int i=0; i< targets.length; i++){
            for (int r = 0; r < targets[i].length(); r++) {
                char t = targets[i].charAt(r);
                if (map.containsKey(t)){
                    // 카운팅 시작
                    answer[i] += map.get(t);
                }else{
                    answer[i] = -1;
                    break;
                }
                // 3. 2번에서 문제 없으면 카운팅 시작


            }
        }

        return answer;
    }
}