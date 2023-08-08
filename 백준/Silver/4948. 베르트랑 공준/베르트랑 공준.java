import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt;
        int cnt2;

        while (true) {
            int N = sc.nextInt();
            if (N == 0) {
                break;
            }
            if(N==1){
                System.out.println("1");
                continue;
            }

            cnt2 = 0;

            for (int i = N+1; i <= N * 2; i++) {
                cnt = 0;
                for (int j = 2; j <= Math.sqrt(i) + 1; j++) {
                    if (i % j == 0) {
                        cnt++;
                        break;
                    }
                }
                if(cnt==0)
                    cnt2++;
            }
            System.out.println(cnt2);
        }
    }
}
