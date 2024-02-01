import java.util.*;
import java.io.*;

public class Main{
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		
		int arr[] = new int [n];
		for(int i=0; i<n ; i++) {
			arr[i]= Integer.parseInt(st.nextToken());
		}
		int cnt = 0;
		int window = 0;
		int high = 0;
		
		for(int i=0; i<x; i++) {
			window += arr[i];
		}
		
		int l = 0;
		int r = x;
		while(r<n) {
			
			if(high<window) {
				high = window;
				cnt = 1;
			}
			else if(high == window) {
				cnt++;
			}
			window = window - arr[l++] + arr[r++];

		}
		if(window == high) {
			cnt++;
		}
		
		
		if(high != 0) {
			System.out.println(high);
			System.out.println(cnt);
		}
		else
			System.out.println("SAD");
		
	}
}
