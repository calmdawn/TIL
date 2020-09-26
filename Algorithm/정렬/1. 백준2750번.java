import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();

		int[] arrayNum = new int[N];

		int len = arrayNum.length;

		int temp = 0;

		for (int i = 0; i < len; i++) {
			arrayNum[i] = scan.nextInt();
		}
		scan.close();

		for (int i = 1; i < len; i++) {
			for (int j = 0; j < len; j++) {
				if (arrayNum[i] < arrayNum[j]) {
					temp = arrayNum[j];
					arrayNum[j] = arrayNum[i];
					arrayNum[i] = temp;
				}

			}
		}

		for (int n : arrayNum) {
			System.out.println(n);
		}

	}
}
