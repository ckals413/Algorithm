////
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine()); 
        int[] ropes = new int[n];
        
        for (int i = 0; i < n; i++) {
            ropes[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(ropes); // 최대 중량을 내림차순으로 정렬
        
        int maxWeight = 0;
        for (int i = 0; i < n; i++) {
            int weight = ropes[i] * (n - i); // 해당 로프까지의 무게 * 선택한 로프 개수
            maxWeight = Math.max(maxWeight, weight);
        }
        
        System.out.println(maxWeight);
    }
}
