import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer sb = new StringBuffer();
        String str = br.readLine();
        int strLength = str.length();
        String arr[] = new String [strLength];
        for(int i =0; i<strLength; i++) {
        	arr[i]= str.substring(i,strLength);
        	
        }
        Arrays.sort(arr);
        for(String i : arr) {
        	sb.append(i+"\n");
        }
       System.out.print(sb);
       
    }
}
