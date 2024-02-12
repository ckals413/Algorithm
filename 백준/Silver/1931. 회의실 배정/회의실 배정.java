import java.util.*;
import java.io.*;

class Main{
	public static void main(String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		int n = Integer.parseInt(br.readLine());
		int arr[][] = new int [n][2];
		
		for(int i =0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0]=Integer.parseInt(st.nextToken());
			arr[i][1]=Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr,(e1,e2)->{
			if(e1[1]==e2[1]) {
				return Integer.compare(e1[0], e2[0]);
			}
			else
				return Integer.compare(e1[1], e2[1]);
		});
		
		int cnt =0; 
		int time = 0; 
		
		for(int i=0; i<n; i++) {
			if(time<=arr[i][0]) {
				cnt++;
				time=arr[i][1];
			}
		}
		System.out.print(cnt++);
		
		
	}
}