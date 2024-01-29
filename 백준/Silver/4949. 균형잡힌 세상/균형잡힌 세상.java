import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
       
        
        while(true) {
        	Stack<Character> stack = new Stack<>();
            boolean balance = true;
        	String str = br.readLine();
        	if(str.equals(".")) {
        		break;
        	}
        	for(int i=0; i<str.length(); i++) {
        		
        		char c = str.charAt(i);
        		if(c=='('||c=='[') {
        			stack.push(c);
        		}
        		else if(c==')'||c==']') {
        			if(!stack.isEmpty()&&((stack.peek()=='('&&c==')')||(stack.peek()=='['&&c==']'))) {
            			stack.pop();
            		}
        			else {
        				
        				balance =false;
        				break;
        			}
        		}
        		

        	} 
        	if(balance&&stack.isEmpty()) {
        		System.out.println("yes");
        	}
        	else {
        		System.out.println("no");
        	}
        }
        
  }
}
