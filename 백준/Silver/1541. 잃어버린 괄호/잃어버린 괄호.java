import java.util.*;
import java.io.*;

public class Main{
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(),"-");
		int sum =Integer.MAX_VALUE; // 큰값으로 설정
		
		while(st.hasMoreTokens()) { 
			int num = 0;
			StringTokenizer sst = new StringTokenizer(st.nextToken(),"+");
			while(sst.hasMoreTokens()) {
				num += Integer.parseInt(sst.nextToken());
			}
			if(sum==Integer.MAX_VALUE) {//맨 처음 수
				sum = num; 
			}else {
				sum -= num;
			}
			
			
		}
		System.out.println(sum);
	}
}