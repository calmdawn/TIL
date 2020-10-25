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

		int N = Integer.parseInt(br.readLine());

		int[][] cosXY = new int[N][2]; // x좌표와 y좌표

		for (int i = 0; i < N; i++) {
			String[] xy = br.readLine().split(" ");
			cosXY[i][0] = Integer.parseInt(xy[0]);
			cosXY[i][1] = Integer.parseInt(xy[1]);
		}

		Arrays.sort(cosXY, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {

				if (o1[0] == o2[0]) {
					return o1[1] - o2[1];
				} else {
					return o1[0] - o2[0];
				}

			}

		});

		for (int j = 0; j < N; j++) {
			bw.write(String.valueOf(cosXY[j][0]) + " " + String.valueOf(cosXY[j][1]) + "\n");
		}

		bw.flush();
		bw.close();

	}

}
