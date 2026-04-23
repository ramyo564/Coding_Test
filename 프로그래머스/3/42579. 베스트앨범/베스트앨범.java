import java.util.*;
class Solution {
    class Song {
        int idx;
        int play;
        Song(int idx, int play){
            this.idx = idx;
            this.play = play;
        }
    }
    public int[] solution(String[] genres, int[] plays) {
        int N = genres.length;
        // 장르별 랭킹 해시맵
        HashMap<String, Integer> rankG = new HashMap<>();
        // 장르별 플래이 및 인덱스 처리
        HashMap<String, ArrayList<Song>> gData= new HashMap<>();
        for(int i = 0; i < N; i++){
            String genre = genres[i];
            int play = plays[i];
            rankG.put(genre, rankG.getOrDefault(genre, 0) + play);
            gData.putIfAbsent(genre, new ArrayList<Song>());
            gData.get(genre).add(new Song(i, play));
        }
        
        // 장르별 랭킹 정렬
        List<String> ranking = new ArrayList<>(rankG.keySet());
        ranking.sort((a,b) -> rankG.get(b) - rankG.get(a));
        
        // 정답 자료
        List<Integer> ans = new ArrayList<>();
        
        for(String g : ranking){
            List<Song> data = gData.get(g);
            data.sort((a,b) -> {
                if(a.play == b.play){
                    return 0;
                }
                return b.play - a.play;
            });
            
            // 2개씩 뽑기
            for(int i = 0; i < Math.min(data.size(), 2); i++ ){
                ans.add(data.get(i).idx);
            }    
        }
        
        
        
        return ans.stream().mapToInt(i -> i).toArray();
    }
}