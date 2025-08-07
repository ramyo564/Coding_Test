import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A, B, C, fr, bk, ret = 0;
        int[] arr = new int[101];
        StringTokenizer st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        for (int i = 0; i < 3; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            fr = Integer.parseInt(st2.nextToken());
            bk = Integer.parseInt(st2.nextToken());
            for (int j = fr; j < bk; j++) {
                arr[j]++;
            }
        }

        for (int i = 0; i < 101; i++) {
            if (arr[i] == 1) {
                ret += arr[i] * A;
            } else if (arr[i] == 2) {
                ret += arr[i] * B;
            } else {
                ret += arr[i] * C;
            }
        }
        System.out.println(ret);

    }
}