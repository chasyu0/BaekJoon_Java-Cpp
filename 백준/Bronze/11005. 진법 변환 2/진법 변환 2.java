import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        StringBuilder sb = new StringBuilder();
        
        // 10진법 수 N, B진법 수
        int N = sc.nextInt();
        int B = sc.nextInt();
        
        while(N>0){
            int remainder = N % B;
            char alpha = (char)(remainder - 10 + 'A');
            
            // 나머지가 10이상일때 알파벳으로 바꾸는 조건문 
            if(remainder<10) {
                sb.append(remainder);
            } else {
                sb.append((char)(remainder - 10 + 'A'));
            }
                N=N/B; // 나머지의 몫 
        }
        
        System.out.println(sb.reverse().toString());
        sc.close();
    }
}