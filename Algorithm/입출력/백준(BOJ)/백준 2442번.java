import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		scan.close();

		for (int i = 1; i <= N; i++) {

			for (int k = 0; k < N - i; k++) { // 공백넣기
				System.out.print(" ");
			}

			for (int j = 0; j < (i * 2) - 1; j++) { // 별 넣기
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
