import java.util.*;

class Solution {
  static class Song {
    int id;
    int playCount;

    public Song(int id, int playCount) {
      this.id = id;
      this.playCount = playCount;
    }
  }

  public int[] solution(String[] genres, int[] plays) {
    Map<String, Integer> genrePlayCount = new HashMap<>();
    Map<String, List<Song>> genreSongs = new HashMap<>();

    for (int i = 0; i < genres.length; i++) {
      // 장르별 play 총 횟수 카운팅
      genrePlayCount.put(genres[i], genrePlayCount.getOrDefault(genres[i], 0) + plays[i]);
      // 장르별 play 내용 indexing
      genreSongs.putIfAbsent(genres[i], new ArrayList<>());
      genreSongs.get(genres[i]).add(new Song(i, plays[i]));
    }

    // 장르별 최고 횟수 순으로 정렬
    List<String> sortedGenres = new ArrayList<>(genrePlayCount.keySet());
    sortedGenres.sort((a, b) -> genrePlayCount.get(b) - genrePlayCount.get(a));

    List<Integer> result = new ArrayList<>();
    for (String genre : sortedGenres) {
      // 정렬된 장르 순으로 진행 -> 플레이 횟수가 높은 순으로 정렬
      List<Song> songs = genreSongs.get(genre);
      songs.sort(
          (a, b) -> {
            if (a.playCount == b.playCount) {
              return a.id - b.id;
            }
            return b.playCount - a.playCount;
          });

      // arrayList에서 플레이 횟수가 가장 높은 것들 중 2개로 짤라서 정답에 넣기
      for (int i = 0; i < Math.min(2, songs.size()); i++) {
        result.add(songs.get(i).id);
      }
    }

    return result.stream().mapToInt(i -> i).toArray();
  }
}