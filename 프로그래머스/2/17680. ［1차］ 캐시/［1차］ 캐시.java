
import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) return cities.length * 5;

        // accessOrder=true => get/put 시 "최근 사용"으로 순서 갱신 (LRU)
        LinkedHashMap<String, Boolean> cache =
                new LinkedHashMap<>(cacheSize, 0.75f, true);

        int time = 0;

        for (String city : cities) {
            String key = city.toLowerCase();

            if (cache.containsKey(key)) {
                // hit
                time += 1;
                cache.get(key); // accessOrder 갱신
            } else {
                // miss
                time += 5;

                if (cache.size() == cacheSize) {
                    // remove LRU (eldest)
                    String eldest = cache.entrySet().iterator().next().getKey();
                    cache.remove(eldest);
                }
                cache.put(key, Boolean.TRUE);
            }
        }

        return time;
    }
}
