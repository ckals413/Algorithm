import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        
        int N = Integer.parseInt(br.readLine());
        String arr[][] = new String [N][2];
        for(int i=0; i<N; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	arr[i][0]=st.nextToken();
        	arr[i][1]=st.nextToken();
        	
        }
        Arrays.sort(arr,(String [] e1, String [] e2)->{
        	if(Integer.parseInt(e1[0])==Integer.parseInt(e2[0])) {
        		return 0;
        	}
        	else {
        		return Integer.parseInt(e1[0])-Integer.parseInt(e2[0]);
        	}
        });
        
        for(int i=0; i<N; i++) {
        	sb.append(arr[i][0]+" "+arr[i][1]+"\n");
        }
        System.out.print(sb);
        
    
    }
}