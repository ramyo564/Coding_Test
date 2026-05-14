import java.util.*;

class Solution {
    static String[] words = {"A", "E", "I", "O", "U"};
    static List<String> list = new ArrayList<>();
    
    public int solution(String word) {
        
        dfs("");
        return list.indexOf(word);
    }
    static void dfs(String w){
        list.add(w);
        if(w.length() == 5){
            return;
        }
        for(int i = 0; i < 5; i ++){
            dfs(w+words[i]);
        }
    }
}