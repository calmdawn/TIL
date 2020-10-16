import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String calculate = br.readLine();

		StringTokenizer st = new StringTokenizer(calculate, "-+", true);
		int result = 0;
		boolean btn = true;

		while (st.hasMoreTokens()) { // 토큰이 남아있을때까지

			String token = st.nextToken();

			if (token.equals("-")) {
				btn = false;
			} else if (token.equals("+")) {

			} else {
				if (btn) {
					result = result + Integer.parseInt(token);
				} else {
					result = result - Integer.parseInt(token);
				}
			}

		}

		bw.write(String.valueOf(result));
		bw.flush();
		bw.close();

	}

}
