import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		/* N, M 입력 받는다. 
		 * 합계 변수 선언. 
		 * 소수를 담을 리스트 선언.
		 * N<소수<M의 범위를 돌리는 반복문 
		 * 소수를 구한다. 
		 * 합이랑, 소수의 최소값을 출력한다.
		 * */
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		int sum = 0;
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=M; i<=N; i++) {
			if (i<2) continue;
			boolean isPrime = true;
			
		// 소수 판정
		for(int j=2; j*j<=i; j++) {
			if (i % j == 0) {
	            isPrime = false;
	            break;
	        }
		}	
			// 합계(sum)에 더하고, 리스트(list)에 추가
			if (isPrime) { 
				sum += i;
				list.add(i); 
				}
		}
		//출력 
		if(list.isEmpty()) {
			System.out.println("-1");
		} else {
			System.out.println(sum);
			System.out.println(list.get(0));
			}
		sc.close();
		}
	}