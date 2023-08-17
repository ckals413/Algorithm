
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N,k;
        int cnt = 0;
        int arr[] = new int[100000000];
        N = sc.nextInt();
        k = sc.nextInt();

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = N-1; i >=0 ; i--) {
            if(k==0)break;
            if(arr[i]<=k){
                cnt = cnt+k/arr[i];
                k %=arr[i];
            }
        }

        System.out.println(cnt);

    }
}
