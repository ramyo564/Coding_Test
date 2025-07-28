
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[27];
        String ret = "";

        for (int i = 0; i < N; i++) {
            String target = br.readLine();
            target.charAt(0);
            arr[target.charAt(0) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] >= 5) {
                ret += (char) ('a' + i);
            }
        }

        if (ret.length() < 1) {
            System.out.println("PREDAJA");
        } else {
            System.out.println(ret);
        }

    }
}