import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();     // 가로
        int M = sc.nextInt();    // 세로
        boolean[][] board = new boolean[N][M];
        
        for(int i=0; i<N; i++) {
            String str = sc.next();
            for(int j=0; j<M; j++) {
                board[i][j] = (str.charAt(j)=='W');
            }
          }
        
        int min = 64;
        
        for(int i=0; i<=N-8; i++) {
            for(int j=0; j<=M-8; j++) {
                
                int count = 0; 
                boolean W = true;    // W로 시작
                
                for(int x=i; x<i+8; x++) {
                    for(int y=j; y<j+8; y++) {
                        if (board[x][y] != W) count++;
                        W = !W;    // count증가시 W가 아니다
                    } 
                    W = !W; 
                }
                min = Math.min(min, Math.min(count, 64-count));
            }
        }
        System.out.println(min);
        sc.close();
        }
    }
