import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        // 5
        int[] A = new int[]{1, 2, 3, 4, 5};
        // 8
        int[] B = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        // 10
        int[] C = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] data = new int[3];
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == A[i%5]){
                data[0]++;
            }
            if(answers[i] == B[i%8]){
                data[1]++;
            }
            if(answers[i] == C[i%10]){
                data[2]++;
            }
        }
        
        int maxPoint = 0;
        for(int i : data){
            maxPoint = Math.max(maxPoint, i);
        }
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < data.length; i++){
            if (data[i] == maxPoint){
                list.add(i+1);
            }
        }
        
        
        return list.stream().mapToInt(i->i).toArray();
    }
}