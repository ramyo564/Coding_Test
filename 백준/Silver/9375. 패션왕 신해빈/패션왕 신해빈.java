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
                st.nextToken();
                String key = st.nextToken();
                map.put(key, map.getOrDefault(key, 0) +1);
            }
            int ret = 1;
            for (Map.Entry<String, Integer> entry : map.entrySet()){
                ret *= entry.getValue() + 1;
            }

            System.out.println(ret - 1);
        }

    }
}