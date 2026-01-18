import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        // 한변의 점의 개수 
		int side = (int)Math.pow(2, N) + 1;
		
		// 한변의 점 개수 제곱
		int total = (int)Math.pow(side, 2);
		
		// 총 점 개수 
		System.out.println(total);
		sc.close();
		}
    }	
        