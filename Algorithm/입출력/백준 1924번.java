import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();
		int y = scan.nextInt();
		scan.close();

		int daySum = 0;

		for (int i = 1; i < x; i++) { // 이번달 이전달까지의 총 일수 합
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
				daySum = daySum + 31;
			} else if (i == 2) {
				daySum = daySum + 28;
			} else {
				daySum = daySum + 30;
			}
		}

		daySum = daySum + y;
		daySum = daySum % 7;

		if (daySum == 0) {
			System.out.print("SUN");
		} else if (daySum == 1) {
			System.out.print("MON");
		} else if (daySum == 2) {
			System.out.print("TUE");
		} else if (daySum == 3) {
			System.out.print("WED");
		} else if (daySum == 4) {
			System.out.print("THU");
		} else if (daySum == 5) {
			System.out.print("FRI");
		} else if (daySum == 6) {
			System.out.print("SAT");
		}

	}
}
