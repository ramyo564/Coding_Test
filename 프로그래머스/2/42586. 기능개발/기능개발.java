import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        // 남은 작업일 계산
        // deque에 넣음
        // 처음 뽑은거 >= 다음꺼 = cnt ++
        int N = speeds.length;
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < N; i++){
            int remain = 100;
            dq.addLast((int) Math.ceil((double) (remain - progresses[i]) / speeds[i]));
        }
        
        List<Integer> list = new ArrayList<>();
        int cnt = 0;
        while(!dq.isEmpty()){
            int n = dq.pollFirst();
            cnt++;
            while(!dq.isEmpty() && n >= dq.peekFirst()){
                dq.pollFirst();
                cnt++;
            }
            list.add(cnt);
            cnt = 0;
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}