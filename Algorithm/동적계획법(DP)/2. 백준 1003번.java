import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {

	static int zero = 0;
	static int one = 0;

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			fibonacci(Integer.parseInt(br.readLine()));
			bw.write(zero + " " + one + "\n");
			zero = 0;
			one = 0;
		}

		bw.flush();
		bw.close();
	}

	public static void fibonacci(int n) {
		if (n == 0) {
			zero++;
		} else if (n == 1) {
			one++;
		} else {
			fibonacci(n - 1);
			fibonacci(n - 2);
		}
	}

}
