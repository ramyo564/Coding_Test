import java.util.*;

class Solution {
  List<Integer>[] list;

  public int solution(int n, int[][] wires) {
    // 전력망 초기화
    list = new ArrayList[n + 1];
    for (int i = 1; i <= n; i++) {
      list[i] = new ArrayList<>();
    }
    // 전력망 배치하기
    for (int[] wire : wires) {
      int first = wire[0];
      int second = wire[1];
      list[first].add(second);
      list[second].add(first);
    }

    System.out.println(Arrays.toString(list));
    int minNum = n;
    for (int[] wire : wires) {
      int cnt1 = bfs(wire, n);
      int cnt2 = n - cnt1;
      minNum = Math.min(minNum, Math.abs(cnt1 - cnt2));
    }
    return minNum;
  }

  private int bfs(int[] wire, int n) {
    boolean[] visited = new boolean[n + 1];
    Deque<Integer> dq = new ArrayDeque<>();
    int start = wire[0];
    int skip = wire[1];
    int cnt = 1;
    visited[start] = true;
    dq.offer(start);

    while (!dq.isEmpty()) {
      int curr = dq.poll();
      for (int next : list[curr]) {
        if (next != skip && !visited[next]) {
          visited[next] = true;
          dq.offer(next);
          cnt++;
        }
      }
    }
    return cnt;
  }
}