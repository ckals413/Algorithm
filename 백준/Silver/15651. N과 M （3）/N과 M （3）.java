//
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static int[] arr; 
	public static boolean [] visit;
	public static StringBuilder sb = new StringBuilder();
	public static int N,M;
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());//1,2,...N-1,N까지 숫자들중에
        M = Integer.parseInt(st.nextToken());//자릿수가 M인 모든 경우의 수를 출력하는 문제 
        
        arr = new int[M]; // M의 자릿수 배열 생성 
        dfs(0);
        
        System.out.println(sb);
   
  }
    public static void dfs(int depth) {//depth는 깊이 즉 자릿수
    	if(depth == M) {
    		for(int val : arr) {
    			sb.append(val+" ");
    		}
    		sb.append("\n");
    		return;
    	}
    	
    	for(int i =1; i<=N; i++) { 
    		arr[depth]=i;
    		dfs(depth+1);
    			
    			
    			
    		
    	}
    }
}
