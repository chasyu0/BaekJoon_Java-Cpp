import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean[][] paper = new boolean[101][101];
        
        int N = sc.nextInt();
        
        for(int k=0; k<N; k++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            for(int i=x; i<x+10; i++) {
                for(int j=y; j<y+10; j++) {
                    paper[i][j]=true;
                }
            }
        }
        int count = 0;
        for(int i=0; i<=100; i++) {
            for(int j=0; j<=100; j++) {
                if(paper[i][j]) count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}