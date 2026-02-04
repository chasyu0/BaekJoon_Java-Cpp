import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/* n수를 입력을 받는다.
		 * 합계 변수 선언 해줌 (담을 공간)
		 * -1을 입력하면 입력을 닫는다.
		 * 약수를 구한다.
		 * n = 약수의 합 이라면 (완전수)
		 * 아니면 N is NOT perfect. 판정을 한다
		 */

		while(true) {
			int n = sc.nextInt();
			if(n == -1) break;
			int sum = 0;

		for(int i=1; i<n; i++) {
			if (n % i == 0) {
				sum += i;
				}
			}
		
		// 판별 및 출력
			if(n == sum) {
				System.out.print(n + " = 1");
				for(int i=2; i<n; i++) {
					if(n % i == 0) {
		                System.out.print(" + " + i);
		            }
				} 
                System.out.println(); // 줄바꿈 필수
			} else {
				System.out.println(n + " is NOT perfect.");
			}
		} 			

		sc.close();
	}
}