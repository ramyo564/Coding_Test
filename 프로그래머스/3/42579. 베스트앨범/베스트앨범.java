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
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, ArrayList<Song>> map2 = new HashMap<>();
        int N = plays.length;
        for(int i = 0; i < N; i ++){
            String gn = genres[i];
            int ply = plays[i];
            map1.put(gn, map1.getOrDefault(gn, 0) + ply);
            map2.putIfAbsent(gn, new ArrayList<>());
            map2.get(gn).add(new Song(i , ply));
        }
        List<String> genr = new ArrayList<>(map1.keySet());
        genr.sort((a,b)-> map1.get(b) - map1.get(a));
        
        List<Integer> ans = new ArrayList<>();
        for(String gn : genr){
            List<Song> res = new ArrayList<>(map2.get(gn));
            res.sort((a,b) -> {
                if(a.play == b.play){
                    return 0;
                }
                return b.play - a.play;
                }
            );
            for(int i = 0; i < Math.min(2, res.size()); i ++){
                ans.add(res.get(i).idx);
            }
        }
        
        
        return ans.stream().mapToInt(i->i).toArray();
    }
}