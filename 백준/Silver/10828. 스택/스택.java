import java.util.*;
import java.io.*;

public class Main{
	public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        Stack<Integer>stack = new Stack<>();
        
        int n = Integer.parseInt(br.readLine());
        String put;
        int num;
        for(int i=0; i<n; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine()," ");
        	put = st.nextToken();
        	
        	switch(put) {
        	case "push":
        		num = Integer.parseInt(st.nextToken());
        		stack.push(num);
        		break;
        	case "pop":
        		if (!stack.isEmpty()) {
                    sb.append(stack.pop()).append("\n");
                } else {
                    sb.append("-1\n");
                }
        		break;
        	case "top":
        		if(!stack.isEmpty()) {
        			sb.append(stack.peek()+"\n");
        		}
        		else
        			sb.append("-1\n");
        		
        		
        		break;
        	case "empty":
        		if(stack.isEmpty()) {
        			sb.append("1\n");
        		}
        		else
        			sb.append("0\n");
        		break;
        		
        	case "size":
        		sb.append(stack.size()+"\n");
        		
        		break;
        	
        	}
        }
        System.out.print(sb);
        
      
		
	}
}