import java.util.*;
import java.io.*;

public class Main{
	public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int arr[]= new int[n];
        for(int i=0; i<n; i++) {
        	arr[i]= Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        
		
		int l =0;
		int r =n-1; 
		int a = 0; 
		int b = 0;
		int min = Integer.MAX_VALUE;
		
		while(r>l) {
			int sum = arr[l]+arr[r];
			if(min> Math.abs(sum)) {
				min = Math.abs(sum);
				a = l;
				b = r;
			}
			if(0 >(sum)) {
				l++;
			}
			else if(0<(sum)) {
				r--;
			}
			else if(0==(sum)) {
				a=l ;
				b=r;
				break;
			}
		}
		System.out.print(arr[a]+" "+ arr[b]);
	
		
	}
}