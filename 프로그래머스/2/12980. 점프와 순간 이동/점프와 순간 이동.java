import java.util.*;

public class Solution {
    public int solution(int n) {
        int ans = 0;

        // 2로 나누는데 나머지 있으면 배터리 ++
        while(n > 0){
            if(n % 2 != 0){
                ans++;
                n -=1;
            }
            n /= 2;
        }
        

        return ans;
    }
}