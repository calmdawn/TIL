import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] firstInput = String.valueOf(br.readLine()).split(" ");
		String[] nums = String.valueOf(br.readLine()).split(" ");

		int n = Integer.parseInt(firstInput[0]); // 배열의 크기
		int m = Integer.parseInt(firstInput[1]); // 주어진 수를 M번 더한다
		int k = Integer.parseInt(firstInput[2]); // 연속해서 k번을 초과해서 더해질 수 없다

		int sum = 0;
		int count = 0;
		Integer[] arrayNum = new Integer[n];

		for (int i = 0; i < arrayNum.length; i++) {
			arrayNum[i] = Integer.parseInt(nums[i]);
		}

		//		내림차순 정렬
		Arrays.sort(arrayNum, Collections.reverseOrder());

		for (int j = 0; j < m; j++) {
			int max;

			if (count < k) {
				max = arrayNum[0];
				count++;
			} else {
				max = arrayNum[1];
				count = 0;
			}

			sum = sum + max;

		}

		bw.write(String.valueOf(sum));
		bw.flush();
		bw.close();

	}
}