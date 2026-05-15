import java.util.*;
class Solution {
    static String[] words = new String[]{"A","E","I","O","U"};
    static List<String> list = new ArrayList<>();
    
    public int solution(String word) {
        recursive("");
        return list.indexOf(word);
    }
    static void recursive(String word){
        list.add(word);
        if(word.length() == 5){
            return;
        }
        for(int i = 0; i < 5; i ++){
            recursive(word + words[i]);
        }
    }
}