import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[] arrNum = new int[N]; // N개의 수를 넣을 배열
		int[] scopeNum = new int[8001]; // -4000 ~ 4000까지를 구분하기위한 배열

		for (int i = 0; i < N; i++) {
			int input = Integer.parseInt(br.readLine());
			arrNum[i] = input;
			scopeNum[input + 4000]++;
		}

		Arrays.sort(arrNum);

		System.out.println((int)average(arrNum));
		System.out.println(middle(arrNum));
		System.out.println(mostApper(scopeNum)-4000);
		System.out.println(range(arrNum));

	}

	static float average(int[] arr) { // 산술 평균

		int length = arr.length;
		int sum = 0;

		for (int i = 0; i < length; i++) {
			sum = sum + arr[i];
		}

		return Math.round(sum / (float) length);

	}

	static int middle(int[] arr) { // 중앙값
		int length = arr.length;
		return arr[length / 2];
	}

	static int mostApper(int[] scopeNum) { // 최빈값

		int length = scopeNum.length;
		int resultIdx = 0; // 최빈값의 주소
		int resultNum = 0; // 최빈값의 빈도
		int totalResultNum = 0; // 최빈값의 개수

		for (int i = 0; i < length; i++) { // 최빈값 빈도 구하기
			if (scopeNum[i] > resultNum) {
				resultNum = scopeNum[i];
				resultIdx = i;
			}
		}

		for (int j = 0; j < length; j++) { // 최빈값의 개수구하기
			if (scopeNum[j] == resultNum) {
				totalResultNum++;
			}
		}

		if (totalResultNum == 1) {
			return resultIdx;
		} else {
			return resultIdx;
		}

	}

	static int range(int[] arr) { // 범위
		int length = arr.length;
		int result = arr[length - 1] - arr[0];

		return result;
	}

}
