import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] xs = new int[1001];
		int[] ys = new int[1001];
		
		for(int i=0; i<3; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
					
			xs[x]++;
			ys[y]++;
		}
		
		int xAnswer = 0; 
		int yAnswer = 0; 
		
		// 한 번만 등장한 좌표가 네 번째 점의 좌표
		// 카운트 값이 1인 인덱스를 정답으로 사용
		for(int i=0; i<1001; i++) {
			if(xs[i] == 1) xAnswer = i;
			if(ys[i] == 1) yAnswer = i;
		}
		
		System.out.println(xAnswer + " " + yAnswer);
		sc.close();
		}
	}

