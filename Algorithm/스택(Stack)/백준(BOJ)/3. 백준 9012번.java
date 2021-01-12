import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int T = scan.nextInt();
		scan.nextLine();

		int count = 0;

		Stack<String> stack = new Stack<>();

		for (int i = 0; i < T; i++) {

			String str = scan.nextLine();

			if (str.charAt(0) == ')') { // 맨 왼쪽 괄호 확인
				System.out.println("NO");

			} else if (str.charAt(str.length() - 1) == '(') { // 맨 오른쪽 괄호 확인
				System.out.println("NO");

			} else {
				for (int j = 0; j < str.length(); j++) {
					stack.push(String.valueOf(str.charAt(j)));
				}

				while (!stack.empty()) {

					if (stack.peek().equals("(")) {
						count--;
					} else if (stack.peek().equals(")")) {
						count++;
					}

					if (count < 0) {
						break;
					}

					stack.pop();
				}

				if (count == 0) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}

			}

			count = 0;
			stack.clear();

		}
	}
}
