////
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt(); // 테스트 케이스의 개수
        
        for (int t = 0; t < T; t++) {
            int R = sc.nextInt(); // 반복 횟수
            String S = sc.next(); // 문자열 S
            
            // 문자열 P 생성
            StringBuilder P = new StringBuilder();
            for (int i = 0; i < S.length(); i++) {
                for (int j = 0; j < R; j++) {
                    P.append(S.charAt(i));
                }
            }
            
            System.out.println(P.toString());
        }
        
        sc.close();
    }
}
