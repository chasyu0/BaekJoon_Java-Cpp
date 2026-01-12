import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String N = sc.next();
        int B = sc.nextInt();
        int sum = 0; 
        
        for(int i=0; i<N.length(); i++) {
            char c = N.charAt(i);
            int idx; 
            
            if (c>='0' && c<='9') {
                idx =c-'0';
            } else {
                idx = c - 'A' + 10;
            } 
            sum = sum * B + idx; 
            
        }
        
        System.out.println(sum);
        sc.close();
    }
}