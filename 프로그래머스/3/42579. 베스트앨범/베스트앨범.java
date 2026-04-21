import java.util.*;
class Solution {
    public int[] solution(String[] genres, int[] plays) {
    int N = genres.length;

    // 장르별 토탈 횟수 해시맵 정리
    // 장르별 인덱스 및 플레이 횟수 정리 (클래스필요)
    // 클래스 선언하기

    class Song {
      int idx;
      int play;

      Song(int idx, int play) {
        this.idx = idx;
        this.play = play;
      }
    }

    HashMap<String, Integer> genTotalCnt = new HashMap<>();
    HashMap<String, ArrayList<Song>> songData = new HashMap<>();

    for (int i = 0; i < N; i++) {
      String genre = genres[i];
      int play = plays[i];
      // 장르별 토탈 카운트
      genTotalCnt.put(genre, genTotalCnt.getOrDefault(genre, 0) + play);
      // 장르별 인덱스 및 플레이 횟수 정리
      songData.putIfAbsent(genre, new ArrayList<>());
      songData.get(genre).add(new Song(i, play));
    }

    // genre ranking 정렬 시작
    List<String> rankingGen = new ArrayList<>(genTotalCnt.keySet());
    rankingGen.sort((a, b) -> genTotalCnt.get(b) - genTotalCnt.get(a));

    // 정렬된 ranking 순으로 작업 시작
    List<Integer> temp = new ArrayList<>();
    for (String genre : rankingGen) {
      List<Song> list = songData.get(genre);
      // Song 정렬
      list.sort(
          (a, b) -> {
            if (b.play - a.play == 0) {
              return 0;
            }
            return b.play - a.play;
          });

      for (int i = 0; i < Math.min(2, list.size()); i++) {
        temp.add(list.get(i).idx);
      }
    }

    return temp.stream().mapToInt(i -> i).toArray();
    }
}