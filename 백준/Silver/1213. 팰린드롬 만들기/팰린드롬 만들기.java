import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        String ret = "";
        char center = ' ';
        int cnt = 0;
        boolean flag = true;
        int[] arr = new int[26];
        for (int i = 0; i < st.length(); i++) {
            arr[st.charAt(i) - 'A']++;
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] % 2 != 0) {
                center = (char) (i + 'A');
                cnt++;
            }
        }
        if (cnt > 1) {
            flag = false;
        }
        StringBuilder sb = new StringBuilder(ret);

        if (flag) {
            for (int i = 0; i < 26; i++) {
                int temp = 0;
                temp = arr[i] / 2;
                for (int j = 0; j < temp; j++) {
                    sb.append((char) (i + 'A'));
                }

            }
            String front = sb.toString();
            String back = sb.reverse().toString();

            if (center != ' ') {
                System.out.println(front + center + back);
            } else {
                System.out.println(front + back);
            }
        } else {
            System.out.println("I'm Sorry Hansoo");
        }

    }
}