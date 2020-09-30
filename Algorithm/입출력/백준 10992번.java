import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		scan.close();

		if (N == 1) {
			System.out.print("*");
		} else {

			for (int k = 0; k < N - 1; k++) {// 첫줄 별그리
				System.out.print(" ");
			}

			System.out.println("*");

			for (int i = 2; i < N; i++) { // 중간줄 별그리기

				for (int k = 0; k < N - i; k++) {
					System.out.print(" ");
				}

				System.out.print("*");

				for (int j = 2; j < (i * 2) - 1; j++) {
					System.out.print(" ");
				}

				System.out.print("*");

				System.out.println();

			}

			for (int j = 0; j < (N * 2) - 1; j++) { // 맨마지막줄 별그리기
				System.out.print("*");
			}

		}

	}
}
