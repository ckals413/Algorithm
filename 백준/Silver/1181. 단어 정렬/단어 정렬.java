import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        
        int N = Integer.parseInt(br.readLine());
        String arr[] = new String[N];
        
        for(int i =0; i<N; i++) {
        	arr[i]= br.readLine();
        }
        Arrays.sort(arr, (s1,s2)->{
        	if(s1.length()==s2.length()) {
        		return s1.compareTo(s2);
        	}
        	else {
        		return s1.length()-s2.length();
        	}
        	
        });
        sb.append(arr[0]+"\n");
        for(int i =1; i<N; i++) { 
        	if(!arr[i].equals(arr[i-1])) //중복되는 단어 삭제
        		sb.append(arr[i]+"\n");
        }
        bw.write(sb.toString()); //sb객체를 문자열로 변환
        bw.flush();
        br.close();
        bw.close();
        
    }
}