
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        String temp;

        Map<String, String> mp = new HashMap<>();

        for (int i = 0; i < N; i++) {
            temp = br.readLine();
            mp.put(temp, String.valueOf(i + 1));
            mp.put(String.valueOf(i + 1), temp);
        }

        for (int i = 0; i < K; i++){
            temp = br.readLine();
            System.out.println(mp.get(temp));
        }

    }
}