import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int Row = 9;     // 행 
        int Col = 9;    // 열
        
        int[][] board = new int[Row][Col]; 
        int maxRow = 0;
        int maxCol = 0;
        
        for(int i=0; i<Row; i++) {
            for(int j=0; j<Col; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        
        // 초기값 처리
        int max = board[0][0];    
        
        for(int i=0; i<Row; i++) {
            for(int j=0; j<Col; j++) {
                if(board[i][j]>max) {
                    max = board[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        
        System.out.println(max);
        System.out.println((maxRow + 1) + " " + (maxCol + 1));
        sc.close();
    }
}