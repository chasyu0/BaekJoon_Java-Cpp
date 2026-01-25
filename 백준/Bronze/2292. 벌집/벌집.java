import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        int range = 1;
        int count;
        
        for(count=1; range<N; count++) {
            range += 6*count;
        }
        System.out.println(count);
        sc.close();
    }
}