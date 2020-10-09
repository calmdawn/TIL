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

		int N = Integer.parseInt(br.readLine());

		Queue<Integer> queue = new LinkedList<Integer>();

		for (int i = 1; i <= N; i++) { // 큐에 1~N까지의 값넣기
			queue.offer(i);
		}

		while (queue.size() != 1) { 		//	큐에 카드가 한장남을때까지 반복
			queue.remove();					//	맨위의 카드 버리기
			queue.offer(queue.remove());	//	맨위의 카드를 맨아래로 옮기기
		}

		bw.write(String.valueOf(queue.peek()));

		bw.flush();
		bw.close();

	}
}
