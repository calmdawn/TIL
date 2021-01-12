// Scanner 사용한 경우

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		scan.close();
		
		int checkNum = 666;
		String number = "";

		while (n > 0) {
			number = String.valueOf(checkNum);
			if (number.contains("666")) {
				n--;
			}
			checkNum++;
		}

		checkNum--;

		System.out.println(checkNum);

	}
}


// Buffer 사용한 경우 50ms 

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		int checkNum = 666;
		String number = "";

		while (n > 0) {
			number = String.valueOf(checkNum);
			if (number.contains("666")) {
				n--;
			}
			checkNum++;
		}

		checkNum--;

		bw.write(String.valueOf(checkNum));
		bw.flush();
		bw.close();

	}
}
