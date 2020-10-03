// 직접 구현한경우
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine()); // 명령의 수

		int[] stack = new int[10000];
		int locateStack = 0; // 스택에서의 현재위치

		for (int i = 0; i < N; i++) {

			String[] command = br.readLine().split(" ");

			if (command[0].equals("push")) {// 값을 넣고 스택위치 한칸 증가

				stack[locateStack] = Integer.parseInt(command[1]);
				locateStack++;

			} else if (command[0].equals("pop")) {

				if (locateStack == 0) { // 스택에 정수가 없는경우
					bw.write("-1" + "\n");
				} else {// 스택에 정수가 있는경우
					bw.write(String.valueOf(stack[locateStack - 1]) + "\n");
					locateStack--;
				}

			} else if (command[0].equals("size")) { // 스택에 있는 정수의 개수 출력

				bw.write(String.valueOf(locateStack) + "\n");

			} else if (command[0].equals("empty")) { // 스택이 비어있으면 1, 아니면 0 출력

				if (locateStack == 0) {
					bw.write("1" + "\n");
				} else {
					bw.write("0" + "\n");
				}

			} else if (command[0].equals("top")) {
				if (locateStack == 0) { // 스택에 정수가 없는경우
					bw.write("-1" + "\n");
				} else {// 스택에 정수가 있는경우
					bw.write(String.valueOf(stack[locateStack - 1]) + "\n");
				}
			}

		}
		bw.flush();
		bw.close();

	}
}



//내부 라이브러리를 사용한 경우

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

		int N = Integer.parseInt(br.readLine()); // 명령의 수

		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < N; i++) {

			String[] command = br.readLine().split(" ");

			if (command[0].equals("push")) {// 값을 넣고 스택위치 한칸 증가

				stack.push(Integer.parseInt(command[1]));

			} else if (command[0].equals("pop")) {

				if (stack.empty()) {
					bw.write("-1" + "\n");
				} else {
					bw.write(String.valueOf(stack.peek()) + "\n");
					stack.pop();
				}

			} else if (command[0].equals("size")) { // 스택에 있는 정수의 개수 출력

				bw.write(String.valueOf(stack.size()) + "\n");

			} else if (command[0].equals("empty")) { // 스택이 비어있으면 1, 아니면 0 출력

				if (stack.empty()) {
					bw.write("1" + "\n");
				} else {
					bw.write("0" + "\n");
				}

			} else if (command[0].equals("top")) {

				if (stack.empty()) {
					bw.write("-1" + "\n");
				} else {
					bw.write(String.valueOf(stack.peek()) + "\n");
				}

			}

		}
		bw.flush();
		bw.close();

	}
}
