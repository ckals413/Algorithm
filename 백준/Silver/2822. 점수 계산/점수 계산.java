import java.util.*;
import java.io.*;

public class Main{
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer sb = new StringBuffer();
		int score[][]= new int[8][2];
		int arr[] = new int[5];
		
		for(int i=0; i<8; i++) {
			score[i][0]=Integer.parseInt(br.readLine());
			score[i][1] =i+1;
		}
		Arrays.sort(score,(e1,e2)->{
			return e2[0]-e1[0];
		});
		int sum =0; 
		
		for(int i=0; i<5; i++) {
			sum += score[i][0];
		}
		bw.write(String.valueOf(sum)+"\n");
		for(int i=0; i<5; i++) {
			arr[i]=score[i][1];
		}
		Arrays.sort(arr);
		for(int i=0; i<5; i++) {
			bw.write(arr[i]+" ");
		}
		bw.flush();
		
		
		
	}
}