import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int arr[]= new int[N];
		int tmp;
		for(int k=0; k<N; k++)arr[k]=k+1;
		
		for(int k =0; k<M; k++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			tmp = arr[j-1];
			arr[j-1]=arr[i-1];
			arr[i-1]=tmp;
		}
		for(int k=0; k<N; k++) {
			System.out.print(arr[k]+" ");
		}
		
	}
}