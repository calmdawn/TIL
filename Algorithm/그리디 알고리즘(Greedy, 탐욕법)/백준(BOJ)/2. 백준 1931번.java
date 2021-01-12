import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.io.BufferedReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine()); // 회의의 개수

		int[][] conferenceInfo = new int[N][2]; // 각 회의의 시작과 끝 정보

		int maxNum = 0;
		int endTime = -1; // 회의의 끝난시간을 비교하기위한 변수

		for (int i = 0; i < N; i++) {

			String[] time = br.readLine().split(" "); // 회의의 시작과 끝시간을 담음
			conferenceInfo[i][0] = Integer.parseInt(time[0]); // 시작시간
			conferenceInfo[i][1] = Integer.parseInt(time[1]); // 종료시간

		}
		Arrays.sort(conferenceInfo, new Comparator<int[]>() { // 회의가 끝나는 시간을 기준으로 오름차순 정렬

			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[1] == o2[1]) {
					return Integer.compare(o1[0], o2[0]);
				}
				return Integer.compare(o1[1], o2[1]);
			}
		});

		for (int i = 0; i < N; i++) {
			if (conferenceInfo[i][0] >= endTime) {
				maxNum++;
				endTime = conferenceInfo[i][1];
			}
		}

		bw.write(String.valueOf(maxNum));
		bw.flush();
		bw.close();

	}

}
