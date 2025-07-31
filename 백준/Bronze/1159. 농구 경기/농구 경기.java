import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int[] arr = new int[26];

        String ret = "";

        for (int i = 0; i < N; i++) {
            arr[br.readLine().charAt(0) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] >= 5) {
                ret += (char) (i + 'a');
            }
        }

        if (ret.length() != 0) {
            System.out.println(ret);
        } else {
            System.out.println("PREDAJA");
        }

    }
}