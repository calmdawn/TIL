import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		int[] queue = new int[N]; // queue 생성

		int size = 0; // 큐에 들어있는 정수의 개수
		int front = 0; // 큐의 가장 앞에 있는 정수
		int back = -1; // 큐의 가장 뒤에 있는 정수 , -1을 준 이유는 가장 처음명령으로 front나, back이 오는 조건을 만족시키기 위함

		for (int i = 0; i < N; i++) { // 명령의 수만큼 반복

			String[] command = br.readLine().split(" ");

			if (command[0].equals("push")) {
				back++;
				size++;
				queue[back] = Integer.parseInt(command[1]);
			} else if (command[0].equals("pop")) {
				if (size > 0) {
					bw.write(String.valueOf(queue[front]) + "\n");
					front++;
					size--;
				} else {
					bw.write(String.valueOf("-1") + "\n");
				}
			} else if (command[0].equals("size")) {
				bw.write(String.valueOf(size) + "\n");

			} else if (command[0].equals("empty")) {
				if (size <= 0) {
					bw.write(String.valueOf("1") + "\n");
				} else {
					bw.write(String.valueOf("0") + "\n");
				}

			} else if (command[0].equals("front")) { // 큐의 가장 앞(front)가 가장 뒤보다(back) 커지면 정수가 없는 경우, 작거나 같으면 정수가 있다.
				if (front > back) {
					bw.write(String.valueOf("-1") + "\n");
				} else {
					bw.write(String.valueOf(queue[front]) + "\n");
				}

			} else if (command[0].equals("back")) { // 큐의 가장 앞(front)가 가장 뒤보다(back) 커지면 정수가 없는 경우, 작거나 같으면 정수가 있다.
				if (front > back) {
					bw.write(String.valueOf("-1") + "\n");
				} else {
					bw.write(String.valueOf(queue[back]) + "\n");
				}
			}

		}
		bw.flush();
		bw.close();
	}

}
