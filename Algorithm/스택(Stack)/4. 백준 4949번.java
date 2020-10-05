import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Stack<String> stack = new Stack<>();

		String str = scan.nextLine();
		String oneChar = "";
		String result = "";

		for (int i = 0; i < str.length(); i++) {

			oneChar = String.valueOf(str.charAt(i));

			if (oneChar.equals("[")) {
				stack.add(oneChar);
			} else if (oneChar.equals("(")) {
				stack.add(oneChar);
			} else if (oneChar.equals(")")) {
				stack.add(oneChar);
			} else if (oneChar.equals("]")) {
				stack.add(oneChar);
			}

		}

		while (!stack.empty()) {

			String checkChar = stack.peek();

			if (checkChar.equals("]")) {
				stack.pop();
				checkChar = stack.peek();
				if (checkChar.equals("[")) {
					stack.pop();
				} else {
					result = "NO";
					break;
				}
			} else if (checkChar.equals(")")) {
				stack.pop();
				checkChar = stack.peek();
				if (checkChar.equals("(")) {
					stack.pop();
				} else {
					result = "NO";
					break;
				}
			}
			
			result = "YES";

		}

		System.out.println(result);

	}
}
