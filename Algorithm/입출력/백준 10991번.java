import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		scan.close();

		for (int i = 1; i <= N; i++) {

			for (int k = 0; k < N - i; k++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= (i * 2) - 1; j++) {

				if (j % 2 == 0) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}

			}

			System.out.println();

		}

	}
}
