import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(br.readLine());
            if (input == 0) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(input);
            }
        }
        
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        
        bw.write(Integer.toString(sum));
        bw.flush();
        bw.close();
        br.close();
    }
}
