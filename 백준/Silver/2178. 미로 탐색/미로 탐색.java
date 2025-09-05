
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String temp = br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[][] arr = new int[a][b];
        boolean[][] visited = new boolean[a][b];

        for (int i = 0; i < a; i++) {
            String temp = br.readLine();
            for (int r = 0; r < b; r++) {
                arr[i][r] = temp.charAt(r) - '0';
            }
        }

        int[] d_row = { 0, 0, -1, 1 };
        int[] d_col = { -1, 1, 0, 0 };

        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] { 0, 0, 1 });
        visited[0][0] = true;

        while (!q.isEmpty()) {
            int[] peek = q.peek();
            q.poll();

            if (peek[0] == a - 1 && peek[1] == b - 1) {
                System.out.println(peek[2]);
                break;
            }

            for (int i = 0; i < 4; i++) {
                int n_row = peek[0] + d_row[i];
                int n_col = peek[1] + d_col[i];

                if (n_row >= 0 && n_row < a && n_col >= 0 && n_col < b) {
                    if (!visited[n_row][n_col] && arr[n_row][n_col] == 1) {
                        q.offer(new int[] { n_row, n_col, peek[2] + 1 });
                        visited[n_row][n_col] = true;

                    }
                }
            }

        }

    }
}