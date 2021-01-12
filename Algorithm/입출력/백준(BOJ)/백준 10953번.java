import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		int sum = 0;

		for (int i = 0; i < T; i++) {
			String str = br.readLine();
			String[] num = str.split(",");
			sum = Integer.parseInt(num[0]) + Integer.parseInt(num[1]);
			bw.write(String.valueOf(sum));
			bw.newLine();
		}

		bw.flush();
		bw.close();

	}
}
