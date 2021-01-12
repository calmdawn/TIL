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
		
		String[][] people = new String[N][2];	//회원들을 담을 배열 
		
		for(int i=0; i<N; i++) {
			String[] memberInfo = br.readLine().split(" ");	//나이, 이름을 저장 
			people[i][0] = memberInfo[0];	//나이 
			people[i][1] = memberInfo[1];	//이름 
		}
		
		Arrays.sort(people, new Comparator<String[]>() {

			@Override
			public int compare(String[] o1, String[] o2) {	//	나이가 어린순서대로 오름차순 정렬 
				int age1 = Integer.parseInt(o1[0]);
				int age2 = Integer.parseInt(o2[0]);
				
				return age1 - age2;
			}
		});
		
		for(int j=0; j<N; j++) {
			bw.write(people[j][0] + " " + people[j][1] +"\n");
		}
		
		bw.flush();
		bw.close();
	}
}
