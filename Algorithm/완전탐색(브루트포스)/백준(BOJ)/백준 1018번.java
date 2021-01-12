import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt(); // 세로
		int m = scan.nextInt(); // 가로
		scan.nextLine();

		int height = n - 8;
		int width = m - 8;

		String lineW = "WBWBWBWBBWBWBWBWWBWBWBWBBWBWBWBWWBWBWBWBBWBWBWBWWBWBWBWBBWBWBWBW";
		String lineB = "BWBWBWBWWBWBWBWBBWBWBWBWWBWBWBWBBWBWBWBWWBWBWBWBBWBWBWBWWBWBWBWB";
		String check = "";

		int count = 64;
		int tempCount = 0;

		String[] board = new String[n];

		for (int i = 0; i < n; i++) {
			board[i] = scan.nextLine();
		}
		scan.close();
		// 1. 위에서 아래로 탐새후 2.왼쪽에서 오른쪽으로 탐색

		for (int k = 0; k <= width; k++) {
			for (int j = 0; j <= height; j++) {
				check = "";
				for (int i = j; i < j + 8; i++) { // 8*8 보드에 넣기
					check = check + board[i].substring(k, k + 8);
				}
				tempCount = blockChangeNum(lineW, lineB, check);
				if (tempCount < count) {
					count = tempCount;
				}

			}
		}

		System.out.println(count);

	}

	// 정사각형 개수의 최솟값구하는 함수
	public static int blockChangeNum(String lineW, String lineB, String check) {
		int numW = 0;
		int numB = 0;

		for (int i = 0; i < lineW.length(); i++) {
			if (lineW.charAt(i) != check.charAt(i)) {
				numW++;
			}
			if (lineB.charAt(i) != check.charAt(i)) {
				numB++;
			}
		}

		return Math.min(numW, numB);

	}

}
