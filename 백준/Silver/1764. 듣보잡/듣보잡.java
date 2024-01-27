import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
       
        ArrayList<String> list = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        
        for(int i =0; i<a; i++) {
        	set.add(br.readLine());
        }
        int cnt =0;
        for(int i=0; i<b; i++) {
        	String str = br.readLine();
        	if(set.contains(str)) {
        		cnt++;
        		list.add(str);
        	}
        }
        Collections.sort(list);
        for(String i:list) {
        	sb.append(i+"\n");
        }
        System.out.println(cnt);
        System.out.print(sb);
        
    }
}
