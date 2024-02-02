import java.util.*;
import java.io.*;

public class Main{
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		char arr[][] = new char [n][m];
		
		for(int i =0; i<n ; i++) {
			String str = br.readLine();
			for(int j=0; j<m; j++) {
				arr[i][j]=str.charAt(j);
			}
		}
		int cnt =0;
		if (k > m) {
			System.out.println(cnt); // 윈도우 크기가 열의 크기보다 크면 0을 출력하고 종료
			return;
		}
		
		for(int i=0; i<n; i++) {
			int window = 0;
			for(int u =0; u<k; u++) {
				window += arr[i][u]-'0';
			}
			for(int j =k; j<m; j++) {
				if(window == 0)
					cnt++;
				window = window -(arr[i][j-k]-'0')+(arr[i][j]-'0');
			}
			if(window == 0)
				cnt++;
		}
		
		System.out.print(cnt);
		
		
		
	}
}
