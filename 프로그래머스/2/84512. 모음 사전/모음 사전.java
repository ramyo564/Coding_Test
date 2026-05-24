import java.util.*;
class Solution {
    static String[] dic = new String[]{"A","E","I","O","U"};
    static List<String> list = new ArrayList<>();
    public int solution(String word) {
        recursive("");
        return list.indexOf(word);
    }
    static void recursive(String data){
        list.add(data);
        if(data.length() == 5){
            return;
        }
        for(int i = 0; i < dic.length; i++){
            recursive(data+dic[i]);
        }
    }
}