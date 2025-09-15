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

        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int lx, ly, rx, ry;
        int cnt = 0;
        // 가로 = M -> x
        // 세로 = N -> y
        boolean visited[][] = new boolean[M][N];
        ArrayList<Integer> ret = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            lx = Integer.parseInt(st.nextToken());
            ly = Integer.parseInt(st.nextToken());
            rx = Integer.parseInt(st.nextToken());
            ry = Integer.parseInt(st.nextToken());

            for (int r = ly; r < ry; r++) {
                for (int t = lx; t < rx; t++) {
                    visited[r][t] = true;
                }
            }
        }

        int[] d_y = { 0, 0, -1, 1 };
        int[] d_x = { -1, 1, 0, 0 };

        for (int y = 0; y < M; y++) {
            for (int x = 0; x < N; x++) {
                if (!visited[y][x]) {
                    cnt++;
                    int extent = 1;
                    visited[y][x] = true;

                    Queue<Point> q = new LinkedList<>();
                    q.add(new Point(y, x));

                    while (!q.isEmpty()) {
                        Point search = q.poll();

                        for (int i = 0; i < 4; i++) {
                            int n_y = search.y + d_y[i];
                            int n_x = search.x + d_x[i];

                            if (n_y >= 0 && n_y < M && n_x >= 0 && n_x < N) {
                                if (!visited[n_y][n_x]) {
                                    visited[n_y][n_x] = true;
                                    q.add(new Point(n_y, n_x));
                                    extent++;
                                }
                            }
                        }
                    }
                    ret.add(extent);
                }
            }
        }

        System.out.println(cnt);
        Collections.sort(ret);
        for(int c: ret){
            System.out.print(c+" ");
        }

    }
}
