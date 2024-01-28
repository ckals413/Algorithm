import java.util.*;
import java.io.*;

public class Main{
	public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a= Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
       
        int arr[]= new int[a+b];
        st = new StringTokenizer(br.readLine());
        for(int i =0; i<a; i++ ) {
        	arr[i]=Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int j= a; j<a+b; j++) {
        	arr[j] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        for(int i : arr) {
        	sb.append(i+" ");
        }
        System.out.print(sb);
		
	}
}