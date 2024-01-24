import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double arr[] = new double[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextDouble();
        }

        double M = 0;
        for (int i = 0; i < N; i++) {
            if (M < arr[i]) M = arr[i];
        }

        double avr = 0;  
        for (int i = 0; i < N; i++) {
            arr[i] = arr[i] / M * 100;
            avr = avr + arr[i];
        }

        System.out.println(avr / N);  
    }
}
