import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        class Song{
            int idx;
            int ply;
            Song(int idx, int ply){
                this.idx = idx;
                this.ply = ply;
            }
        }
        int N = plays.length;
        HashMap<String, Integer> gtp = new HashMap<>();
        HashMap<String, ArrayList<Song>> gcl = new HashMap<>();
        for(int i = 0; i < N; i ++){
            String genre = genres[i];
            int play = plays[i];
            gtp.put(genre, gtp.getOrDefault(genre, 0) + play);
            gcl.putIfAbsent(genre, new ArrayList<Song>());
            gcl.get(genre).add(new Song(i, play));
        }
        List<String> glist = new ArrayList<>(gtp.keySet());
        glist.sort((a,b) -> gtp.get(b) - gtp.get(a));
        
        ArrayList<Integer> res = new ArrayList<>();
        for(String gen : glist){
            List<Song> arr = new ArrayList<>(gcl.get(gen));
            arr.sort((a,b) -> b.ply - a.ply);
            for(int i = 0; i < Math.min(2, arr.size()); i++){
                res.add(arr.get(i).idx);
            }
        }

        return res.stream().mapToInt(i->i).toArray();
    }
}