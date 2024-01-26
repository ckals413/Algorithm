import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        
        int N = Integer.parseInt(br.readLine());
        String arr[][] = new String[N][4];
        for(int i=0; i<N; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	arr[i][0]= st.nextToken();
        	arr[i][1]= st.nextToken();
        	arr[i][2]= st.nextToken();
        	arr[i][3]= st.nextToken();	
        }
        Arrays.sort(arr,(e1,e2)->{
        	if(Integer.parseInt(e1[1])==Integer.parseInt(e2[1])) {// 국 같으면
        		if(Integer.parseInt(e1[2])==Integer.parseInt(e2[2])) {// 국,영 같으면
        			if(Integer.parseInt(e1[3])==Integer.parseInt(e2[3])) {// 국,영,수 같으면
        				return e1[0].compareTo(e2[0]); //국영수 같으면, 사전순
        			}
        			return Integer.parseInt(e2[3])-Integer.parseInt(e1[3]);	//국,영 같으면, 수학이 감소하는 순으로 
        		}
        	
        	return Integer.parseInt(e1[2])-Integer.parseInt(e2[2]);//국 같으면 영어 증가하는 순서
        	}
        	else {//국어가 다르면 
        		return Integer.parseInt(e2[1])-Integer.parseInt(e1[1]); //국어가 감소하는 순으로 
        	}
        	
        	
        });
        
        for(int i =0; i<N; i++) {
        	sb.append(arr[i][0]+"\n");
        }
        System.out.print(sb);
        
        
      
    
    }
}