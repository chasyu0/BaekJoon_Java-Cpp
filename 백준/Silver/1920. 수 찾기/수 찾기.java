import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		// 1. BufferedReader로 입력 속도 업그레이드
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		
		int N = Integer.parseInt(br.readLine());
		int A[] = new int[N];
		
		// StringTokenizer로 한 줄에 들어온 숫자들을 쪼개기
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		// 2. [필수] 이분 탐색 정렬
		Arrays.sort(A);
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		// 출력을 모았다가 한 번에 내보내는 StringBuilder
		StringBuilder sb = new StringBuilder();
		
		for(int j=0; j<M; j++) {
			int X = Integer.parseInt(st.nextToken());
			
			// 3. for문 대신 이분 탐색 도구 사용 (시간 복잡도)
			if (Arrays.binarySearch(A, X) >= 0) {
                sb.append(1).append("\n");
            } else {
                sb.append(0).append("\n");
            	}
			}
		
			// 출력
			System.out.println(sb);
		}
	}
