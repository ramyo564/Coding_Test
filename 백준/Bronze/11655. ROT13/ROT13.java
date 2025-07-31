
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String target = br.readLine();
        String ret  = "";
        for (int i = 0; i < target.length(); i++) {
            char c = target.charAt(i);

            if ('A' <= c && 'Z' >= c) {
                ret += (char) ((c - 'A' + 13) % 26 + 'A');
            }
            else if ('a' <= c && 'z' >= c) {
                ret += (char) ((c - 'a' + 13) % 26 + 'a');
            }
            else {
                ret += c;
            }
        }

        System.out.println(ret);
    }
}
