import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		BigInteger bigInteger = new BigInteger("0");

		BigInteger f0 = new BigInteger("0");
		BigInteger f1 = new BigInteger("1");
		BigInteger temp = new BigInteger("0");

		if (N == 0) {   
			bigInteger = f0;
      
		} else if (N == 1) {
			bigInteger = f1;
      
		} else {
			for (int i = 2; i <= N; i++) {
				temp = f0.add(f1);
				f0 = f1;
				f1 = temp;
				bigInteger = temp;
			}
		}

		bw.write(String.valueOf(bigInteger));

		bw.flush();
		bw.close();
	}
}
