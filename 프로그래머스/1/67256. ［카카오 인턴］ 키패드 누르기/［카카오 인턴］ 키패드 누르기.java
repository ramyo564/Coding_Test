import java.util.*;
class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();

        // 각 숫자의 좌표 정보를 미리 저장 (0~9, 10은 *, 11은 #)
        int[][] pos = {
            {3, 1}, // 0
            {0, 0}, {0, 1}, {0, 2}, // 1, 2, 3
            {1, 0}, {1, 1}, {1, 2}, // 4, 5, 6
            {2, 0}, {2, 1}, {2, 2}, // 7, 8, 9
            {3, 0}, {3, 2}  // 10(*), 11(#)
        };

        // 고정적으로 사용하는 손가락 맵
        HashMap<Integer, String> keyMap = new HashMap<>();
        keyMap.put(1, "L"); keyMap.put(4, "L"); keyMap.put(7, "L");
        keyMap.put(3, "R"); keyMap.put(6, "R"); keyMap.put(9, "R");

        // 현재 손가락 위치 (10: *, 11: #)
        int curL = 10;
        int curR = 11;

        for (int num : numbers) {
            if (keyMap.containsKey(num)) {
                String finger = keyMap.get(num);
                answer.append(finger);
                if (finger.equals("L")) curL = num;
                else curR = num;
            } else {
                // 가운데 열 (2, 5, 8, 0) - 거리 계산
                int distL = Math.abs(pos[curL][0] - pos[num][0]) + Math.abs(pos[curL][1] - pos[num][1]);
                int distR = Math.abs(pos[curR][0] - pos[num][0]) + Math.abs(pos[curR][1] - pos[num][1]);

                if (distL < distR) {
                    answer.append("L");
                    curL = num;
                } else if (distR < distL) {
                    answer.append("R");
                    curR = num;
                } else {
                    // 거리가 같을 경우 주력 손 사용
                    if (hand.equals("left")) {
                        answer.append("L");
                        curL = num;
                    } else {
                        answer.append("R");
                        curR = num;
                    }
                }
            }
        }

        return answer.toString();
    }
}