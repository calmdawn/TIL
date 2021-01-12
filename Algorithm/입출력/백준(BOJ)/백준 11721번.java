import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		scan.close();

		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
			if ((i + 1) % 10 == 0) {
				System.out.println();
			}
		}

	}
}
