//
import java.util.*;
import java.io.*;

public class Main{
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuffer sb = new StringBuffer();
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int [n];
		int result[]= new int[n];
		
		Stack<Integer> stack = new Stack<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		for(int i=n-1; i>=0; i--) {
			while(!stack.isEmpty()&&stack.peek()<=arr[i]) { //스택의 값보다 더 크면
				stack.pop(); // 스택 비우기
			}
			if(stack.isEmpty()) {
				result[i]=-1;
			}else {
				result[i]=stack.peek();
			}
			stack.push(arr[i]);
		}
		
		 for (int i = 0; i < n; i++) {
	            sb.append(result[i]).append(" ");
		 }
		 bw.write(sb.toString());
		 bw.flush();
		
	}
}