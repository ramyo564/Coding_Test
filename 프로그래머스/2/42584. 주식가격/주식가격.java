import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        Deque<Integer> dq = new ArrayDeque<>();
        int[] arr = new int[prices.length];
        for(int i = 0; i< prices.length; i++){
            while(!dq.isEmpty() && prices[dq.peek()] > prices[i]){
                int idx = dq.pop();
                arr[idx] = i - idx;
            }
            dq.push(i);
        }
        while(!dq.isEmpty()){
            int idx = dq.pop();
            arr[idx] = prices.length - idx -1;
        }
        
        return arr;
    }
}