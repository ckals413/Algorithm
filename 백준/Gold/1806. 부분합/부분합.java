////
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int len = Integer.MAX_VALUE; // 최소 길이를 구해야 하므로 초기값을 최대값으로 설정
        int sum = 0;
        int start = 0;

        for (int end = 0; end < n; end++) {
            sum += arr[end];

            while (sum >= s) { // 현재 부분합이 S 이상인 경우
                len = Math.min(len, end - start + 1); // 길이 갱신
                sum -= arr[start++]; // start를 한 칸 옮겨서 길이를 줄임
            }
        }

        if (len == Integer.MAX_VALUE) {
            len = 0; // 불가능한 경우 0 출력
        }

        bw.write(Integer.toString(len));
        bw.flush();
    }
}
//