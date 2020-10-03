import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int K = Integer.parseInt(br.readLine());
		int sum = 0; // 수의 합
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < K; i++) {
			int num = Integer.parseInt(br.readLine());

			if (num == 0) { // 정수가 0일경우
				sum = sum - stack.peek();
				stack.pop();
			} else { // 정수가 0이 아닐 경우
				sum = sum + num;
				stack.push(num);
			}

		}

		bw.write(String.valueOf(sum));
		bw.flush();
		bw.close();

	}
}
