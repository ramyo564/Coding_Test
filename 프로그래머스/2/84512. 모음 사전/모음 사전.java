import java.util.*;

class Solution {
    static String[] words = {"A","E","I","O","U"};
    static List<String> list = new ArrayList<>();
    public int solution(String word) {
        dfs("");
        
        return list.indexOf(word)+1;
    }
    private void dfs(String data){
        if(!data.equals("")){
            list.add(data);
        }
        if(data.length() == 5){
            return;
        }
        for(int i = 0; i < words.length; i++){
            dfs(data+words[i]);
        }
    }
}