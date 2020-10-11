import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int testCase = Integer.parseInt(br.readLine()); // 테스트 케이스

		for (int t = 0; t < testCase; t++) {

			String[] strNM = br.readLine().split(" "); // N과 M을 입력받음
			String[] strRank = br.readLine().split(" "); // 중요도를 입력받음

			Queue<Integer> queue = new LinkedList<Integer>(); // 입력받은 중요도를 각각 저장하는 큐

			int N = Integer.parseInt(strNM[0]); // 문서의 수 = 중요도의 개수
			int M = Integer.parseInt(strNM[1]); // 몇번쨰로 인쇄되는지 궁금한 문서의 현재위치

			int count = 0; // 인쇄된 수
			boolean print;

//			변수선언 끝			

			for (int i = 0; i < N; i++) { // 큐에 중요도 저장
				queue.offer(Integer.parseInt(strRank[i]));
			}

			while (!queue.isEmpty()) {

				print = true;
				int q = queue.remove(); // 맨앞의 큐를 가져온다

				if (M == -1) { // 궁금한 문서의 이동
					M = queue.size() - 1;
				} else {
					M--;
				}

				for (int j = 0; j < queue.size(); j++) { // 나머지 큐값들중 중요도 확인
					if (q < queue.peek()) { // 1번째 큐값보다 중요도가 높은 값이 있다면
						print = false;
					}
					queue.offer(queue.remove());
				}

				if (print) { // 중요도가 가장 높은 경우 //인쇄
					count++;
					if (M == -1) {
						break;
					}

				} else {
					queue.offer(q);
				}

			}

			bw.write(String.valueOf(count + "\n"));
		}

		bw.flush();
		bw.close();
	}

}
