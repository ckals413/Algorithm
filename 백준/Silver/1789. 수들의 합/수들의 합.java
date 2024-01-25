import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
        long n = Long.parseLong(br.readLine()); //long으로 입력 받아야함? 
        long i = 1;
        long sum = 0;
        while (sum <= n) {
            sum += i;
            cnt++;
            i++;
        }

        System.out.println(cnt - 1);
    }
}
