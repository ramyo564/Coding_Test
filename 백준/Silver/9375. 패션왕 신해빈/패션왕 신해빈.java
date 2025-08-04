import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int M = Integer.parseInt(br.readLine());
            Map<String, Integer> map = new HashMap<>();

            for (int j = 0; j < M; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String a = st.nextToken();
                String b = st.nextToken();
                map.put(b, map.getOrDefault(b, 0) + 1);
            }

            int temp = 1;
            for (Map.Entry<String, Integer> entry : map.entrySet()){
                temp *= (entry.getValue() + 1);

            }

            System.out.println(temp - 1);
        }

    }
}