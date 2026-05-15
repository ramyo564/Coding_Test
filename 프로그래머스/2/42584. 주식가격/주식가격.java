import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        int N = prices.length;
        Deque<Integer> dq = new ArrayDeque<>();
        int[] arr = new int[N];
        for(int i = 0; i < N; i ++){
            while(!dq.isEmpty() && prices[dq.peek()] > prices[i]){
                int num = dq.pop();
                arr[num] = i - num;
            }
            dq.push(i);
        }

        while(!dq.isEmpty()){
            int num = dq.pop();
            arr[num] = N-num-1;
        }
        return arr;
    }
}