import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		/* 종말의 수란 6이 적어도 3개이상 들어가는 수 
	    (브루트포스 알고리즘 사용)
	    제일 작은 수 부터 666, 1666, 2666, 3666, 4666, 5666,
	    N = 7 6660, 6661, 6662, 6663, ... 
	    숫자에 666이 포함되어 있으면 문자열 변환
	    어떤 결과값이든 666은 반드시 포함이지만. 
	    그 666은 항상 숫자의 뒷자리가 아닌 변동이 있다. (중간에 낄수도 있다) 
	    컴퓨터는 1씩 증가할떄 666이 아니면 카운트 하지 않는다. 
	    */
        
		int N = sc.nextInt();
		
		int num = 666;
		int count = 1; 
		
		// 내가 찾을 N번째 까지 카운트 증가 
		while(count != N) {
			num++;
			if(String.valueOf(num).contains("666")) {
				count++;
			}
		}
		System.out.println(num);
		sc.close();
	}
}
