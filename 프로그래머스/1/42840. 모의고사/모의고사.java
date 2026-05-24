import java.util.*;

class Solution {
    static int[] A = new int[]{1, 2, 3, 4, 5}; // 5
    static int[] B = new int[]{2, 1, 2, 3, 2, 4, 2, 5}; // 8
    static int[] C = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; // 10
    public int[] solution(int[] answers) {
        int[] res = new int[3];
        for (int i = 0; i < answers.length; i++){
            if(answers[i] == A[i%5]){
                res[0]++;
            }
            if(answers[i] == B[i%8]){
                res[1]++;
            }
            if(answers[i] == C[i%10]){
                res[2]++;
            }
        }
        int top = 0;
        for(int i : res){
            top = Math.max(top, i);
        }
        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i < res.length; i++){
            if(res[i] == top){
                arr.add(i+1);
            }
        }
        arr.sort((a,b)->a-b);
        return arr.stream().mapToInt(i->i).toArray();
    }
}