import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine()); // 단어의 개수

		String[] arrayText = new String[N]; // 단어, 단어의길이

		for (int i = 0; i < N; i++) {
			arrayText[i] = br.readLine(); // 단어 입력
		}

		Arrays.sort(arrayText, new Comparator<String>() { // -1:내림차순 0:같음 1:오름차순

			@Override
			public int compare(String str1, String str2) {
				int len1 = str1.length(), len2 = str2.length(); // 단어의 길이 입력

				if (len1 != len2) { // 1. 단어의 길이가 다른경우
					return len1 - len2;
				} else { // 2. 길이가 같으면 사전순

					return str1.compareTo(str2);
				}

			}
		});

		bw.write(arrayText[0] + "\n");

		for (int j = 1; j < N; j++) {
			if (!arrayText[j].equals(arrayText[j - 1])) {
				bw.write(arrayText[j] + "\n");
			}

		}
		bw.flush();
		bw.close();
	}

}
