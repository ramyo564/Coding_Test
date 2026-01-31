
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        class St {

            private ArrayList<Integer> data = new ArrayList<>();

            public void push(int value) {
                data.add(value);
            }

            public int pop() {
                if (data.isEmpty()) {
                    return -1;
                }
                return data.remove(data.size() - 1);
            }

            public int size() {
                return data.size();
            }

            public int empty() {
                if (data.isEmpty()) {
                    return 1;
                } else {
                    return 0;
                }
            }

            public int top() {
                if (data.isEmpty()) {
                    return -1;
                }
                return data.get(data.size() - 1);
            }
        }


        St stack = new St();
        for (int i = 0; i < N; i++) {
            String temp = br.readLine();
            if (temp.contains(" ")) {
                String[] parts = temp.split(" ");
                if (parts[0].equals("push")) {
                    stack.push(Integer.parseInt(parts[1]));
                }
            } else if (temp.contains("top")) {
                System.out.println(stack.top());
            } else if (temp.contains("size")) {
                System.out.println(stack.size());
            } else if (temp.contains("empty")) {
                System.out.println(stack.empty());
            } else if (temp.contains("pop")) {
                System.out.println(stack.pop());
            }

        }
        br.close();
    }
}
