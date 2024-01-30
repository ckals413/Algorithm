import java.util.*;
import java.io.*;

public class Main{
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		Stack<Character> stack = new Stack<>();
		Stack<Character> stack2 = new Stack<>();
		
		for(int i=0; i<str.length(); i++ ) {
			stack.push(str.charAt(i));
		}
		int n = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			switch(s) {
			case "L":
				if(!stack.isEmpty()) {
					stack2.push(stack.pop());
				}
				
				break;
			case "D":
				if(!stack2.isEmpty()) {
					stack.push(stack2.pop());
				}
				break;
			
			case "B":
				if(!stack.isEmpty()) {
					stack.pop();
				}
				break;
			case "P":
				char c = st.nextToken().charAt(0);
				stack.push(c);
				
				break;
			
			
			}
		}
		while(!stack.isEmpty()) {
			stack2.push(stack.pop());
		}
		while(!stack2.isEmpty()) {
			bw.write(stack2.pop());
		}
		
		bw.flush();
	}
}