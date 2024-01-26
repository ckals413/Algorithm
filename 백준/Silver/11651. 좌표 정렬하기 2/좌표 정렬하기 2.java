import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        
        int N = Integer.parseInt(br.readLine());
        
        int[][]arr = new int[N][2];
        for(int i=0; i<N; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	arr[i][0]=Integer.parseInt(st.nextToken());
        	arr[i][1]=Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr,(e1,e2)->{
        	if(e1[1]==e2[1]) { // 뒤에 두자리가 같으면? 
        		return e1[0]-e2[0]; //앞에 두자리 비교해서 정렬
        	}
        	else {// 앞에 두자리가 다르다면? 
        		return e1[1]-e2[1]; // 뒤 두자리 비교해서 정렬
        	}
        });
        
        for(int i=0; i<N; i++) {
        	sb.append(arr[i][0]+" "+arr[i][1]+ "\n");
        }
        
        System.out.print(sb);
        
    }
}