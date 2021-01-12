import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] deque = new int[N]; //덱 자료구조
		
		int frontLocate =0, backLocate = -1, size =0;
		
		while(N>0) {
									
			String[] commands = br.readLine().split(" ");	//명령을 저장
			
			if(commands[0].equals("push_front")) {			//정수를 덱의 앞에 넣는다
				for(int i=backLocate; i>=0; i--) { 			//한칸씩 뒤로 이동
					deque[i+1] = deque[i];
				}
				backLocate++;
				deque[frontLocate] = Integer.parseInt(commands[1]);				
				size++;
				
			}else if(commands[0].equals("push_back")) {		// 정수를 덱의 뒤에 넣는다
				backLocate++;
				deque[backLocate] = Integer.parseInt(commands[1]);				
				size++;
				
			}else if(commands[0].equals("pop_front")) {		//덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다
				if(size>0) {
					bw.write(String.valueOf(deque[frontLocate]) + "\n");
					frontLocate++;
					size--;
				}else {
					bw.write("-1" + "\n");
				}
				
			}else if(commands[0].equals("pop_back")) {		//덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
				if(size>0) {
					bw.write(String.valueOf(deque[backLocate]) + "\n");
					backLocate--;
					size--;
				}else {
					bw.write("-1" + "\n");
				}
				
			}else if(commands[0].equals("size")) {			//덱에 들어있는 정수의 개수를 출력한다.
				bw.write(String.valueOf(size) + "\n");
				
			}else if(commands[0].equals("empty")) {			//덱이 비어있으면 1을, 아니면 0을 출력한다.
				if(size>0) {
					bw.write("0" + "\n");
				}else {
					bw.write("1" + "\n");
				}
				
			}else if(commands[0].equals("front")) {			//덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다
				if(size>0) {
					bw.write(String.valueOf(deque[frontLocate]) + "\n");
				}else {
					bw.write("-1" + "\n");
				}
				
			}else if(commands[0].equals("back")) {			//덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
				if(size>0) {
					bw.write(String.valueOf(deque[backLocate]) + "\n");
				}else {
					bw.write("-1" + "\n");
				}
			}
											
			N--;
		}
		
		bw.flush();
		bw.close();
		
	}

}
