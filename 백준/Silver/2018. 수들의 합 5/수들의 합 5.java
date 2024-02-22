import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main{
	public static void main(String[] args) throws Exception {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
	int n = Integer.parseInt(br.readLine());
	int cnt = 0; 
	int sum =0; 
	int front =1; 
	
	for(int i=1; i<=n; i++) {
		sum +=i;
		while(sum>n) {
			sum -= front++;
		}
		if(sum == n) {
			cnt ++;
		}
	}
	
	System.out.println(cnt);
	
	}
}