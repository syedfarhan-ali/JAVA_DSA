public class NQueensOneSol {
    public static boolean isSafe(char board[][], int row, int col){
        //vetical up
        for(int i=row-1; i>=0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        //left up diagonal
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        //right up diagonal
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }

    public static boolean placeNQueens(char board[][], int row){
        //base case 
        if(row == board.length){
            return true;
        }

        //column loop
        for(int j=0; j<board.length; j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                if(placeNQueens(board, row+1)){//recursion call
                    return true;
                }
                board[row][j] = 'x';//backtracking step
            }
        }
        return false;
    }

    public static void printBoard(char board[][]){
        System.out.println("------------ chess board ------------");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 2;
        char board[][] = new char[n][n];
        //initialization
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = 'x';
            }
        }

        if(placeNQueens(board, 0)){
            System.out.println("solution is possible");
            printBoard(board);
        } else {
            System.out.println("solution is not possible");
        }
    }
}
