import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] str = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);

		int max = 0;

		for (int i = 0; i < n; i++) {
			int min = 10000;

			String[] line = br.readLine().split(" ");

			for (int j = 0; j < m; j++) {
				min = Math.min(min, Integer.parseInt(line[j]));
			}

			max = Math.max(min, max);

		}

		bw.write(String.valueOf(max));
		bw.flush();
		bw.close();

	}

}
