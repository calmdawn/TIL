import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] N = br.readLine().split("");

		Arrays.sort(N, Collections.reverseOrder());

		for (int i = 0; i < N.length; i++) {
			bw.write(N[i]);
		}

		bw.flush();
		bw.close();

	}

}
