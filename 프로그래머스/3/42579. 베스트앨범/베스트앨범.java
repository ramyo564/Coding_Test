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
        HashMap<String, Integer> gRank = new HashMap<>();
        HashMap<String, ArrayList<Song>> songs = new HashMap<>();
        for(int i = 0; i < plays.length; i++){
            String g = genres[i];
            int p = plays[i];
            gRank.put(g, gRank.getOrDefault(g, 0) + p);
            songs.putIfAbsent(g, new ArrayList<Song>());
            songs.get(g).add(new Song(i, p));
        }
        
        ArrayList<String> list = new ArrayList<>(gRank.keySet());
        list.sort((a,b)-> gRank.get(b) - gRank.get(a));
        
        List<Integer> res = new ArrayList<>();
        for(String s : list){
            ArrayList<Song> slist = songs.get(s);
            slist.sort((a,b) -> b.play - a.play);
            for(int i = 0; i < Math.min(slist.size(), 2); i++){
                res.add(slist.get(i).idx);
            }
        }
        
        return res.stream().mapToInt(i->i).toArray();
    }
}