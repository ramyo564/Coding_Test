import java.util.*;
class Solution {
    // 5
    static int[] A = new int[] {1, 2, 3, 4, 5,};
    // 8
    static int[] B = new int[] { 2, 1, 2, 3, 2, 4, 2, 5};
    // 10
    static int[] C = new int[] {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    
    static int[] res = new int[3];
    
    public int[] solution(int[] answers) {
        for(int i = 0; i < answers.length; i ++){
            if(A[i%5] == answers[i]){
                res[0]++;
            }
            if(B[i%8] == answers[i]){
                res[1]++;
            }
            if(C[i%10] == answers[i]){
                res[2]++;
            }
        }
        int max = 0;
        for(int num : res){
            max = Math.max(num, max);
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i< res.length; i ++){
            if(res[i] == max){
                list.add(i+1);
            }
        }
        
        return list.stream().mapToInt(i->i).toArray();
    }
}