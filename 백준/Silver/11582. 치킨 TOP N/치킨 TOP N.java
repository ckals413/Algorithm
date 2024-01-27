import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i<N; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		int k = Integer.parseInt(br.readLine());
		int sp=N/k;
		for(int j=0; j<N;j+=sp) {
			Arrays.sort(arr,j,j+sp);
		}
		for(int i=0; i<N; i++) {
			sb.append(arr[i]+" ");
		}
		System.out.print(sb);
		
		
	}
}