
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 1; i < N + 1; i++) {
            dq.addLast(i);
        }

        while (dq.size() > 1) {
            dq.removeFirst();
            dq.addLast(dq.removeFirst());
        }

        System.out.println(dq.removeFirst());


        br.close();
    }
}
