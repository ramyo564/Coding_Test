import java.util.*;
class Solution {
    Set<Integer> set = new HashSet<>();
    
    public int solution(String numbers) {
        recursive("", numbers);
        int cnt = 0;
        for (int num : set) {
            if (isPrime(num)) cnt++;
        }
        return cnt;
    }
    private void recursive(String data, String nums){
        if(!data.equals("")){
            set.add(Integer.parseInt(data));
        }
        for(int i = 0; i < nums.length(); i++){
            recursive(data + nums.charAt(i), nums.substring(0, i) + nums.substring(i+1));
        }
    }
    
    private boolean isPrime(int n){
        if(n < 2){
            return false;
        }
        for(int i = 2 ; i <= (int)Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}