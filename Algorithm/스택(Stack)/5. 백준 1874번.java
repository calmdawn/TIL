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

		Stack<Integer> stack = new Stack<>();

		int testCase = Integer.parseInt(br.readLine());
		int maxPushNum = 0; // push된 최대 값
		StringBuilder sb = new StringBuilder();

		boolean check = true;

		// 맨 처음 들어오는수
		int input = Integer.parseInt(br.readLine());

		maxPushNum = input;
		for (int j = 1; j <= input; j++) { // 첫번째 들어오는 수까지 스택에 추가
			stack.push(j);
			sb.append("+\n");
		}

		stack.pop(); // 첫번쨰 수를 스택에서 제거
		sb.append("-\n");

		for (int i = 1; i < testCase; i++) {

			if (maxPushNum < testCase) { // 최대값을 입력받을 때까지

				input = Integer.parseInt(br.readLine());

				if (input > maxPushNum) { // 입력값이 더 큰경우
					while (maxPushNum + 1 <= input) {
						stack.push(maxPushNum + 1);
						sb.append("+\n");
						maxPushNum++;
					}

				} else if (input == stack.peek()) { // 입력값이 스택 최상단 값보다 -1 작을 경우

				} else {
					check = false;
					break;
				}
				stack.pop();
				sb.append("-\n");

			} else { // 최대값을 입력받은 이후
				input = Integer.parseInt(br.readLine());

				if (input == stack.peek()) {
					stack.pop();
					sb.append("-\n");

				} else {
					check = false;
					break;
				}
			}

		}

		if (check) {
			bw.write(sb.toString());
		} else {
			bw.write("NO");
		}

		bw.flush();
		bw.close();

	}

}
// 처음에 String로 문자열 처리를 하니 메모리 초과가 나서 StringBuilder로 
