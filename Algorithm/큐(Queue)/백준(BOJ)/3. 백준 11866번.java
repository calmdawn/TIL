import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringBuilder answer = new StringBuilder();
		String[] str = br.readLine().split(" ");

		int N = Integer.parseInt(str[0]);
		int K = Integer.parseInt(str[1]);

		Queue<Integer> queue = new LinkedList<Integer>();

		answer.append("<");

		for (int i = 1; i <= N; i++) { // 큐에 1~N명까지 사람의 순서 넣기
			queue.offer(i);
		}

		while (queue.size() != 1) { // 큐에 값이 하나남을때까지 반복
			for (int j = K - 1; j > 0; j--) { // K번째 사람을 제거
				queue.offer(queue.remove());
			}
			answer.append(String.valueOf(queue.remove()) + ", ");
		}

		answer.append(String.valueOf(queue.remove()) + ">"); // 마지막 값

		bw.write(answer.toString());

		bw.flush();
		bw.close();

	}
}
