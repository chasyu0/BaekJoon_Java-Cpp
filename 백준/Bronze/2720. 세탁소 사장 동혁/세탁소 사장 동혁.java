import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 쿼터 25센트, 다임 10센트, 니켈 5센트, 페니 1센트 
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			int C = sc.nextInt();
			
			int Quarter = C / 25;
			C %= 25;
			
			int Dime = C / 10;
			C %= 10;
			
			int Nickel = C / 5;
			C %= 5;
			
			int Penny = C;
			
			System.out.println(Quarter + " " + Dime + " " + Nickel + " " + Penny);
			}
			sc.close();

		}
}	
