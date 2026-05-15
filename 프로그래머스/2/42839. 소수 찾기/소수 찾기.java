import java.util.*;
class Solution {
    static Set<Integer> set = new HashSet<>();
    public int solution(String numbers) {
        int cnt = 0; 
        recursive("", numbers);
        for(int i : set){
            if(isPrime(i)){
                cnt++;
            }
        }
        return cnt;
    }
    static void recursive(String comb, String others){
        if(!comb.equals("")){
            set.add(Integer.parseInt(comb));
        }
        for(int i = 0; i < others.length(); i++){
            recursive(comb+others.charAt(i), others.substring(0, i) + others.substring(i+1));
        }
    }
    
    static boolean isPrime(int num){
        if(num < 2){
            return false;
        }
        for(int i = 2; i<= (int)Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}