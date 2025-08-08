import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int N = sc.nextInt();
            
            int ret = 1;
            int num = 1 % N;

            while (num != 0) {
                num = (num * 10 + 1) % N;
                ret++;
            }

            System.out.println(ret);
        }

        sc.close();
    }
}