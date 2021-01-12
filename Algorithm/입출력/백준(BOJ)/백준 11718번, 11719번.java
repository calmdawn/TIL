import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		System.out.println(str);

		while (scan.hasNextLine()) {
			str = scan.nextLine();
			System.out.println(str);

		}
		scan.close();
	}
}
