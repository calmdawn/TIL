import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] strNM = br.readLine().split(" ");

		int N = Integer.parseInt(strNM[0]);					//	가지고있는 동전의 종류
		int K = Integer.parseInt(strNM[1]);					//	K원

		int[] coinCost = new int[N];						//	동전의 가치가 저장되는 배열
		int coinCount = 0;									//	필요한 동전 개수

		for (int i = 0; i < coinCost.length; i++) {			// 오름차순으로 동전의 가치 저장
			coinCost[i] = Integer.parseInt(br.readLine());
		}

		for (int j = coinCost.length - 1; j >= 0; j--) {	// 가장큰 동전의 가치부터 K원을 만든다.

			if (K >= coinCost[j]) {
				K = K - coinCost[j];
				coinCount++;
				j++;
			}

		}

		bw.write(String.valueOf(coinCount));
		bw.flush();
		bw.close();

	}

}
