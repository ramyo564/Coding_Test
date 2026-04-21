import java.util.*;
class Solution {
    public int[] solution(String[] genres, int[] plays) {
        
        int N = plays.length;
        // 장르 랭킹 해시맵
        // 노래 정보 해시맵
        class Song{
            int idx;
            int play;
            Song(int idx, int play){
                this.idx = idx;
                this.play = play;
            }
        }
        
        HashMap<String, Integer> genresPlayCnt = new HashMap<>();
        HashMap<String, ArrayList<Song>> songData = new HashMap<>();
        
        for(int i = 0; i < N; i ++){
            String genre = genres[i];
            int play = plays[i];
            genresPlayCnt.put(genre, genresPlayCnt.getOrDefault(genre, 0) + play);
            songData.putIfAbsent(genre, new ArrayList<>());
            songData.get(genre).add(new Song(i, play));
        }
        
        // genres 내림차순 정렬
        List<String> rankingGenre = new ArrayList<>(genresPlayCnt.keySet());
        rankingGenre.sort((a,b) -> genresPlayCnt.get(b) - genresPlayCnt.get(a));
        
        List<Integer> ans = new ArrayList<>();
        // 정렬순으로 데이터 정규화
        for(String genre : rankingGenre){
            List<Song> data = songData.get(genre);
            data.sort((a,b) -> {
                if(a.play == b.play){
                    return 0;
                }
                return b.play - a.play;
            });
            
            // 조건에 맞는 idx 2개 씩 뽑기
            for(int i = 0; i < Math.min(2, data.size()); i++){
                ans.add(data.get(i).idx);
            }   
        }
        
        return ans.stream().mapToInt(i->i).toArray();
    }
}