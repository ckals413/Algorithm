import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N,t,k;
    String s;
    N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            t = sc.nextInt();
            String[] name = new String[t];
            int[] drink = new int[t];
            for (int j = 0; j < t; j++) {
                name[j] = sc.next();
                drink[j] = sc.nextInt();
            }
            int max = drink[0];
            int idx =0;
            for (int j = 0; j < drink.length; j++) {
                if(max<drink[j]){
                    max = drink[j];
                    idx = j;
                }
            }
            System.out.println(name[idx]);
        }
    }
}
