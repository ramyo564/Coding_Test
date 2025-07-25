
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        // StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(br.readLine());
        String target = br.readLine();
        
        int pos = target.indexOf("*");
        String front = target.substring(0, pos);
        String back = target.substring(pos + 1);

        for (int i = 0; i < N; i ++){
            String temp = br.readLine();
            if (temp.length() < front.length() + back.length()){
                System.out.println("NE");
                continue;
            }
            if (temp.substring(0,front.length()).equals(front) 
            && temp.substring(temp.length()-back.length()).equals(back)){
                System.out.println("DA");
            }else{
                System.out.println("NE");
            }

        }

    }
}
