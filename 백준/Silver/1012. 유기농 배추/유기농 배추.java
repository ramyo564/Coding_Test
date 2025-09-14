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

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            // 가로 = M -> x
            // 세로 = N -> y

            int arr[][] = new int[N][M];
            boolean visited[][] = new boolean[N][M];
            Queue<Point> q = new LinkedList<>();
            Queue<Point> in_q = new LinkedList<>();

            for (int r = 0; r < K; r++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                arr[y][x] = 1;
                q.add(new Point(y, x));
            }

            int[] d_y = { 0, 0, -1, 1 };
            int[] d_x = { -1, 1, 0, 0 };
            int cnt = 0;
            while (!q.isEmpty()) {
                Point cur = q.poll();
                if (!visited[cur.y][cur.x]) {
                    visited[cur.y][cur.x] = true;
                    cnt++;
                    in_q.add(new Point(cur.y, cur.x));
                    while (!in_q.isEmpty()) {
                        Point search = in_q.poll();
                        for (int k = 0; k < 4; k++) {
                            int n_y = search.y + d_y[k];
                            int n_x = search.x + d_x[k];

                            if (n_y >= 0 && n_y < N && n_x >= 0 && n_x < M) {
                                if (!visited[n_y][n_x] && arr[n_y][n_x] == 1) {
                                    visited[n_y][n_x] = true;
                                    in_q.add(new Point(n_y, n_x));
                                }
                            }
                        }
                    }
                }

            }
            System.out.println(cnt);
        }

    }
}