import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        /* N수를 입력받는다.
		 * 2부터 시작해서 for문으로 반복한다.
		 * N>1 크면, 그자체의 수를 출력
		 */
        
        int N = sc.nextInt();
        
        for(int i=2; i*i<=N; i++) {
            while(N % i == 0) {
                System.out.println(i);
                    N/=i;
            }
        }
        if(N>1) System.out.println(N);
        sc.close();
    }
}