import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Stack<String> stack = new Stack<>();

		String str = "";
		String oneChar = "";

		while (!(str = scan.nextLine()).equals(",")) {

			stack.clear();
			

			if (str.equals(".")) { // 입력의 종료조건인 . 이 들어온 경우
				break;

			}

			for (int i = 0; i < str.length(); i++) { // 입력 종료조건이아닌 경우

				oneChar = String.valueOf(str.charAt(i));

				if (oneChar.equals("[")) {
					stack.push(oneChar);
				} else if (oneChar.equals("(")) { // [ 또는 ( 이면 스택에 추가
					stack.push(oneChar);
				} else if (oneChar.equals(")")) {
					if (stack.empty()) {
						stack.push(oneChar);
						break;
					} else if (stack.peek().equals("[")) {

						break;
					}
					stack.pop();
				} else if (oneChar.equals("]")) {
					if (stack.empty()) {
						stack.push(oneChar);
						break;
					} else if (stack.peek().equals("(")) {

						break;
					}
					stack.pop();
				}
			}

			if (!stack.empty()) { // 왼쪽 괄호만 있는 경우
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}

		}
		scan.close();
	}

}
