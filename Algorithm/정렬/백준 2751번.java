import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		ArrayList<Integer> arrayList = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			arrayList.add(Integer.parseInt(br.readLine()));
		}

		Collections.sort(arrayList);

		for (int j = 0; j < N; j++) {
			bw.write(arrayList.get(j) + "\n");
		}
		bw.flush();
		bw.close();

	}
}
