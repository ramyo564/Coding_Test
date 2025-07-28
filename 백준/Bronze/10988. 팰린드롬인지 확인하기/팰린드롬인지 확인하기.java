import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer st = new StringTokenizer(br.readLine());

        String target = br.readLine();
        String ret = "";

        for (int i = target.length() - 1; i >= 0; i--)
        {
            ret += target.charAt(i);
        }
        

        if (target.equals(ret))
        {
            System.out.println(1);
        }
        else
        {
            System.out.println(0);
        }

    }
}