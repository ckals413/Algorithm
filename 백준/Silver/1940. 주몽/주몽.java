import java.util.*;
import java.io.*;

public class Main{
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		
		int arr[] = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i]= Integer.parseInt(st.nextToken());
		}
		int l =0; 
		int r = n-1;
		int cnt =0; 
		int sum = 0;
		Arrays.sort(arr);
		
		while(l<r) {
			sum = arr[l]+arr[r];
			if(sum == m) {
				cnt++;
			}
			if(sum<m) {
				l++;
			}
			else
				r--;
			
		}
		System.out.print(cnt);
		
		
	}
}
