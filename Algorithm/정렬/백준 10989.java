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

		int[] countArray = new int[10000000];

		for (int i = 0; i < N; i++) {
			int temp = Integer.parseInt(br.readLine());
			countArray[temp] = countArray[temp] + 1;
		}

		for (int j = 0; j < countArray.length; j++) {
			if (countArray[j] != 0) {
				for (int k = 0; k < countArray[j]; k++) {
					bw.write(String.valueOf(j) + "\n");
				}
			}
		}
		bw.flush();
		bw.close();

	}
}
