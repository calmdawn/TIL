import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());	// 사람의 수
		int[] P = new int[N];						// 줄을서는 순서
		int minNum = 0;

		String[] arrTime = br.readLine().split(" ");// 입력받은 줄서는 순서

		for (int i = 0; i < N; i++) {
			P[i] = Integer.parseInt(arrTime[i]);
		}

		Arrays.sort(P);								// 최소한의 시간이 걸리는 줄서는순서

		for (int i = 1; i < N; i++) {
			P[i] = P[i - 1] + P[i];
			minNum = minNum + P[i];
		}

		minNum = minNum + P[0];

		bw.write(String.valueOf(minNum));
		bw.flush();
		bw.close();

	}

}
