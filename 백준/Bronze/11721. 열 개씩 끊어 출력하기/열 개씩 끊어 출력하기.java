import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String [] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();

		for(int i = 0; i<str.length(); i+=10) {
			for(int j =i; j<i+10&& j<str.length(); j++) {
				System.out.print(str.charAt(j));
			}
			System.out.println();
		}
	}
}
