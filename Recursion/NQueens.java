package Recursion;
import java.util.*;
public class NQueens {
    public static void main(String[] args){
        System.out.println();
        // Scanner in = new Scanner(System.in);
        // int n = in.nextInt();
        int n =4;
        List<List<String>> solutions = solveNQueens(n);
        System.out.println("The solutions are :");
        printSolutions(solutions);
    }

    

    private static List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char board[][] = new char[n][n];
        for(int i=0; i<n; i++){
            Arrays.fill(board[i],'.');
        }

        int[] leftRow = new int[n];
        int[] upperDiagonal = new int[2*n-1];
        int[] lowerDiagonal = new int[2*n-1];
        solve(0,n,board,ans, leftRow, lowerDiagonal , upperDiagonal);
        return ans;
    }

    private static void solve(int col, int n, char[][] board, List<List<String>> ans, int[] leftRow, int[] lowerDiagonal,
            int[] upperDiagonal) {

                if(col==n){
                    List<String> res = new ArrayList<>();
                    for(int i=0; i<n; i++){
                        res.add(new String(board[i]));
                    }
                    ans.add(res);
                    return;
                }

                for(int row =0; row<n; row++){
                    if(canPlace(row,col,n,leftRow, lowerDiagonal, upperDiagonal)){
                        board[row][col]='Q';
                        leftRow[row]=1;
                        lowerDiagonal[row+col]=1;
                        upperDiagonal[n-1+col-row]=1;
                        solve(col+1, n, board, ans, leftRow, lowerDiagonal, upperDiagonal);
                        board[row][col]='.';
                        leftRow[row]=0;
                        lowerDiagonal[row+col]=0;
                        upperDiagonal[n-1+col-row]=0;
                    }
                }
    }

    private static boolean canPlace(int row, int col, int n, int[] leftRow, int[] lowerDiagonal, int[] upperDiagonal) {
        return leftRow[row]==0 && lowerDiagonal[row+col]==0 && upperDiagonal[n-1 + col-row]==0;
    }


    private static void printSolutions(List<List<String>> solutions) {
        if(solutions.isEmpty()){
            System.out.println("No solutin found");
            return;
        }
        int idx = 1;
        for(List<String> sol : solutions){
            System.out.println("Solution "  + (idx++) +  ":");
            for(String row :sol){
                System.out.println(row);
            }
            System.out.println();

        }
    }



    
}
