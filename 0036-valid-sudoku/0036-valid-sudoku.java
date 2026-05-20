class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        // 행 검사
        for(int i=0; i<9; i++) {
            boolean[] check = new boolean[10];
            for(int j=0; j<9; j++) {
                char c = board[i][j];
                if(c=='.') continue;
                int num = c - '0';
                if(check[num]) return false;
                check[num] = true;
            }
        }

        // 열 검사
        for(int j=0; j<9; j++) {
            boolean[] check = new boolean[10];
            for(int i=0; i<9; i++) {
                char c = board[i][j];
                if(c=='.') continue;
                int num = c - '0';
                if(check[num]) return false;
                check[num] = true;
            }
        }

        // 3*3 박스 검사
        for(int row=0; row<9; row+=3) {
            for(int col=0; col<9; col+=3) {
                boolean[] check = new boolean[10];
                for(int i=row; i<row+3; i++) {
                    for(int j=col; j<col+3; j++) {
                        char c = board[i][j];
                        if(c=='.') continue;
                        int num = c - '0';
                        if(check[num]) return false;
                        check[num] = true;
                    }
                }
            }
        }
        return true;
    }
}