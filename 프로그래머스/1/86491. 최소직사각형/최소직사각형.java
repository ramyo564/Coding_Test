import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        // 왼쪽이 제일 큰 값으로 정렬
        // 정렬된 값중 오른쪽의 큰 값으로 정렬
        int l = 0;
        int r = 0;
        for(int[] a : sizes){
            int temp = 0;
            if(a[0] < a[1]){
                temp = a[0];
                a[0] = a[1];
                a[1] = temp;
            }
            l = Math.max(a[0], l);
            r = Math.max(a[1], r);
        }

        return l * r;
    }
}