import java.util.*;
class Data {
  boolean first;
  int data;
  int speed;

  Data(boolean first, int data, int speed) {
    this.first = first;
    this.data = data;
    this.speed = speed;
  }
}

class Solution {
  public int[] solution(int[] progresses, int[] speeds) {
    // if(progress.length == 0){
    //     return ;
    // }

    // 큐에 progress 넣어둠
    // 큐에 첫번째가 뭔지 기억해야함
    Queue<Data> q = new LinkedList<>();
    for (int i = 0; i < speeds.length; i++) {
      if (q.isEmpty()) {
        q.add(new Data(true, progresses[i], speeds[i]));
      } else {
        q.add(new Data(false, progresses[i], speeds[i]));
      }
    }
    // 첫번째 큐가 100 이면 cnt ++
    // 다음 큐도 100인지 체크

    int cnt = 0;
    ArrayList<Integer> list = new ArrayList<>();
    while (!q.isEmpty()) {
      Data d = q.peek();
      if (d.first && d.data >= 100) {
        cnt++;
        q.poll();
        while (!q.isEmpty() && q.peek().data >= 100) {
          cnt++;
          q.poll();
        }
        list.add(cnt);
        cnt = 0;
        if (q.isEmpty()) {
          break;
        }
        q.peek().first = true;
      } else {
        for (Data z : q) {
          z.data += z.speed;
        }
      }
    }

    return list.stream().mapToInt(Integer::intValue).toArray();
  }
}