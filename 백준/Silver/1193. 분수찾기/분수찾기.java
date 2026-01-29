import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numerator = 0;
        int denominator = 0;
        int line = 1;
        
        int X = sc.nextInt();
        
        while(X>line) {
            X -= line;
            line++;
        }
        
        // line이 짝수 일때 (분자 증가 분모 감소), 홀수 일때 (분모 증가, 분자 감소) 
        if(line % 2 == 0) {
            numerator = X;
            denominator = line - X + 1;
        } else {
            numerator = line - X + 1;
            denominator = X;
        }
        
        System.out.println(numerator + "/" + denominator);
        sc.close();
    }
}