import java.util.*;

class Solution {
    static Set<Integer> set = new HashSet<>();
    public int solution(String numbers) {
        recursive("", numbers);
        int answer = 0;
        for(int i : set){
            if(isPrime(i)){
                answer++;
            }
        }
        return answer;
    }
    static void recursive(String com, String others){
        if(!com.equals("")){
            set.add(Integer.parseInt(com));
        }
        for(int i = 0; i < others.length(); i++){
            recursive(com+others.charAt(i), others.substring(0,i) + others.substring(i+1));
        }
    }
    
    static boolean isPrime(int num){
        if(num < 2){
            return false;
        }
        for(int i = 2; i <= (int)Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}