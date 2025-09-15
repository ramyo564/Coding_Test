import java.io.*;
import java.util.*;

public class Main {

    static class Point {
        int y, x;

        Point(int y, int x) {
            this.y = y;
            this.x = x;
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String temp = br.readLine();
        // StringTokenizer st = new StringTokenizer(br.readLine());
        // int N = Integer.parseInt(st.nextToken());
        // int M = Integer.parseInt(st.nextToken());

        int N = Integer.parseInt(br.readLine());

        int height = 0;
        int answer = 0;
        int arr[][] = new int[N][N];
        Queue<Point> q = new LinkedList<>();
        Queue<Point> q_2 = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int r = 0; r < N; r++) {
                int temp = Integer.parseInt(st.nextToken());
                arr[i][r] = temp;
                if (temp > height) {
                    height = temp;
                }
            }
        }
        int d_y[] = { 0, 0, -1, 1 };
        int d_x[] = { -1, 1, 0, 0 };
        // N = y
        // M = x
        while (height > -1) {
            boolean visited[][] = new boolean[N][N];
            for (int i = 0; i < N; i++) {
                for (int r = 0; r < N; r++) {

                    if (arr[i][r] > height - 1) {
                        q.add(new Point(i, r));
                    }
                }
            }
            int cnt = 0;
            while (!q.isEmpty()) {
                Point point = q.poll();

                if (!visited[point.y][point.x]) {
                    visited[point.y][point.x] = true;
                    q_2.add(new Point(point.y, point.x));
                    cnt++;
                    while (!q_2.isEmpty()) {
                        Point search = q_2.poll();
                        for (int i = 0; i < 4; i++) {
                            int n_y = search.y + d_y[i];
                            int n_x = search.x + d_x[i];

                            if (n_y >= 0 && n_y < N && n_x >= 0 && n_x < N) {
                                if (!visited[n_y][n_x] && arr[n_y][n_x] > height - 1) {
                                    visited[n_y][n_x] = true;
                                    q_2.add(new Point(n_y, n_x));
                                }
                            }
                        }
                    }
                }
            }
            if (cnt > answer) {
                answer = cnt;
            }
            height--;
        }
        System.out.println(answer);
    }
}