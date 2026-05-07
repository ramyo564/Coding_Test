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
        int N = plays.length;
        HashMap<String, Integer> gRank = new HashMap<>();
        HashMap<String, ArrayList<Song>> gens = new HashMap<>();
        
        for(int i = 0; i < N; i++){
            String g = genres[i];
            int ply = plays[i];
            gRank.put(g, gRank.getOrDefault(g, 0) + ply);
            gens.putIfAbsent(g, new ArrayList<Song>());
            gens.get(g).add(new Song(i, ply));
            
        }
        
        List<String> rk = new ArrayList<>(gRank.keySet());
        rk.sort((a,b) -> gRank.get(b) - gRank.get(a));
        
        List<Integer> ans = new ArrayList<>();
        for(String genreName : rk){
            List<Song> info = new ArrayList<>(gens.get(genreName));
            info.sort((a,b) -> b.play - a.play);
            for(int i = 0; i < Math.min(2, info.size()); i++){
                ans.add(info.get(i).idx);
            }
            
        }
        
        return ans.stream().mapToInt(i -> i).toArray();
    }
}