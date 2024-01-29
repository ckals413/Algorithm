import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
        
         String str = br.readLine();
         Stack<Character> stack = new Stack<>();
         
         for(int j=0; j<str.length(); j++) {
        	 char c = str.charAt(j);
        	 if(c=='(') {
        		 stack.push(c);
        	 }
        	 else if(c==')') {
        		 if(stack.isEmpty()) {
        			 stack.push(c);
        			 break;
        		 }
        		 else {
        			 stack.pop();
        		 }
        	 }
         }
         if(stack.isEmpty()) {
        	 sb.append("YES\n");
         }
         else {
        	 sb.append("NO\n");
         }
        }
        bw.write(sb.toString());
        bw.flush();
        
        br.close();
    }
}
