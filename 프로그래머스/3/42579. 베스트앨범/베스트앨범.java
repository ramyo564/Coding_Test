import java.util.*;
class Solution {
    public int[] solution(String[] genres, int[] plays) {
        class Song{
            int idx;
            int play;
            Song(int idx, int play){
                this.idx = idx;
                this.play = play;
            }
        }
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, ArrayList<Song>> map2 = new HashMap<>();
        int N = genres.length;
        
        for(int i = 0; i < N; i ++){
            String genre = genres[i];
            int play = plays[i];
            map.put(genre, map.getOrDefault(genre, 0) + play);
            map2.putIfAbsent(genre, new ArrayList<Song>());
            map2.get(genre).add(new Song(i,play));
        }
        
        List<String> list = new ArrayList<>(map.keySet());
        list.sort((a,b)-> map.get(b) - map.get(a));
        
        
        List<Integer> res = new ArrayList<>();
        for(String s : list){
            List<Song> glst = new ArrayList<>(map2.get(s));
            glst.sort((a,b) -> {
                if(a.play == b.play){
                    return a.idx - b.idx;
                }
                return b.play - a.play;
            });
            for(int i = 0; i < Math.min(2, glst.size()); i++){
                res.add(glst.get(i).idx);
            }
        }
        
        return res.stream().mapToInt(i->i).toArray();
    }
}