import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        Deque<Integer> dq = new ArrayDeque<>();
        int N = prices.length;
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            while(!dq.isEmpty() && prices[dq.peek()] > prices[i]){
                int idx = dq.pop();
                arr[idx] = i - idx;
            }
            dq.push(i);
        }
        while(!dq.isEmpty()){
            int idx = dq.pop();
            arr[idx] = N - idx - 1;
        }
        
        return arr;
    }
}