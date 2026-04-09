import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        // 우선 완전 탐색으로 해보자
        Queue<Integer> q = new LinkedList<>();
        for(int i : prices){
            q.add(i);
        }
        

        List<Integer> list = new ArrayList<>();
        int idx = 1;
        while(!q.isEmpty()){
            int target = q.poll();
            int cnt = 0;
            for (int i = idx; i < prices.length; i++){
                cnt++;
                if(prices[i] >= target){
                    continue;
                }else {
                    break;
                }
            }
            list.add(cnt);
            idx++;
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}