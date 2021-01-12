import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();;
		Stack<Character> stack = new Stack<>();

		while (!str.equals(".")) {

			for (int i = 0; i < str.length(); i++) { // 문자열 글자하나하나 확인

				char chStr = str.charAt(i);

				if (chStr == '(' || chStr == '[') { // 왼쪽 괄호일경우 스택에 추가
					stack.push(chStr);
				} else if (chStr == ')') {
					if (stack.empty() || stack.peek() == '[') {
						stack.push(chStr);
						break;
					}
					stack.pop();
				} else if (chStr == ']') {
					if (stack.empty() || stack.peek() == '(') {
						stack.push(chStr);
						break;
					}
					stack.pop();
				}

			}

			if (stack.empty()) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}

			stack.clear();
			str = scan.nextLine();

		}
		scan.close();
	}

}
