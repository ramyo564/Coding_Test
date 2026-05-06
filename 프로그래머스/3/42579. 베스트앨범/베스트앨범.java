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
        HashMap<String, Integer> rk = new HashMap<>();
        HashMap<String, ArrayList<Song>> gen = new HashMap<>();
        int N = plays.length;
        
        for (int i = 0; i < N; i ++){
            String genre = genres[i];
            int play = plays[i];
            rk.put(genre, rk.getOrDefault(genre, 0) + play);
            gen.putIfAbsent(genre, new ArrayList<Song>());
            gen.get(genre).add(new Song(i, play));
        }
        
        List<String> gRk = new ArrayList<>(rk.keySet());
        gRk.sort((a,b) -> rk.get(b) - rk.get(a));
        
        List<Integer> ans = new ArrayList<>();
        for(String name : gRk){
            List<Song> l = gen.get(name);
            l.sort((a, b) -> b.play - a.play);
            for(int i = 0; i < Math.min(2, l.size()); i++){
                ans.add(l.get(i).idx);
            }
        }
        
        return ans.stream().mapToInt(i -> i).toArray();
    }
}