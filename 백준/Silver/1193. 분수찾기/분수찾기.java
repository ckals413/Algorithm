import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        
        int line = 1; 
        int cnt = 0;
        
        // X가 몇 번째 대각선 라인에 있는지 확인
        while (cnt + line < X) {
            cnt += line;
            line++;
        }
        
        int bunja, bunmo;
        int n = X- cnt;
        
        // 대각선 라인이 짝수일 때
        if (line % 2 == 0) {
            bunja = n;
            bunmo = line - n + 1;
        } 
        // 대각선 라인이 홀수일 때
        else {
            bunja = line - n + 1;
            bunmo = n;
        }
        
        System.out.println(bunja + "/" + bunmo);
    }
}
