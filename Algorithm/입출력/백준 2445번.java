import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		scan.close();

		for (int i = 1; i <= N; i++) {

			for (int j = 0; j < i; j++) { // 별 넣기
				System.out.print("*");
			}

			for (int k = 0; k < 2 * (N - i); k++) { // 공백 넣기
				System.out.print(" ");
			}

			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}

			System.out.println();

		}

		for (int i = N - 1; i > 0; i--) {

			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}

			for (int k = 0; k < 2 * (N - i); k++) {
				System.out.print(" ");
			}

			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}

			System.out.println();

		}

	}
}
