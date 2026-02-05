import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        StringBuilder sb = new StringBuilder();
        
        while(true) {
        String S = sc.next();
        if(S.equals("0")) break;    
            
        boolean isPalindrome = true;

        for(int i=0; i<S.length()/2; i++) {
            if(S.charAt(i) != S.charAt(S.length()-1-i)){
                isPalindrome = false;
                break;
            }
        }
            // 최종 출력
            sb.append(isPalindrome ?  "yes\n" : "no\n");  
        }
        System.out.print(sb);
		sc.close();
    }
}