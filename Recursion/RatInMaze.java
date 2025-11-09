// package Recursion;
// import java.util.*;

// public class RatInMaze {
//     public static void main(String[] args){
//         System.out.println();
//         int[][] board = {
//             {1,0,0,0},
//             {1,1,0,1},
//             {1,1,0,0},
//             {0,1,1,1}
//         };
 

//          int[][] visited = new int[board.length][board[0].length];
//         ArrayList<String> ans = new ArrayList<>();

//         if (board[0][0] == 1) {
//             findPath(0, 0, board, visited, "", ans);
//         }

//         System.out.println("All possible paths: " + ans);
//     }
    

//     private static void findPath(int i, int j, int[][] board, int[][] visited, String s, ArrayList<String> ans) {
      
//       int m = board.length;
//       int n = board[0].length;
//       if(i==m-1 && j==n-1){
//         ans.add(s);
//         return;
//       }
//       visited[i][j]=1;
//       if(i<m-1 && j<n && visited[i][j]==0 && board[i][j]==1){
//         s=s+"D";
        
//         findPath(i+1, j, board, visited,s, ans);
//       }
//       if(i<m && j<n-1 && visited[i][j]==0 && board[i][j]==1){
//         s=s+"R";
        
//         findPath(i, j+1, board, visited,s, ans);
//       }
//       if(i<m && j>0 && visited[i][j]==0 && board[i][j]==1){
//         s=s+"L";
        
//         findPath(i, j-1, board, visited,s, ans);
//       }
//       if(i>0 && j<n && visited[i][j]==0 && board[i][j]==1){
//         s=s+"U";
        
//         findPath(i-1, j, board, visited,s, ans);
//       }

//       visited[i][j]=0;
//     }
// }
    
package Recursion;
import java.util.*;

public class RatInMaze {
    public static void main(String[] args){
        int[][] board = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {1, 1, 0, 0},
            {0, 1, 1, 1}
        };

        int[][] visited = new int[board.length][board[0].length];
        ArrayList<String> ans = new ArrayList<>();

        if (board[0][0] == 1) {
            findPath(0, 0, board, visited, "", ans);
        }

        System.out.println("All possible paths: " + ans);
    }

    private static void findPath(int i, int j, int[][] board, int[][] visited, String path, ArrayList<String> ans) {
        int m = board.length;
        int n = board[0].length;

        // Base case: reached destination
        if (i == m - 1 && j == n - 1) {
            ans.add(path);
            return;
        }

        // Mark as visited
        visited[i][j] = 1;

        // Move Down
        if (i + 1 < m && visited[i + 1][j] == 0 && board[i + 1][j] == 1)
            findPath(i + 1, j, board, visited, path + "D", ans);

        // Move Right
        if (j + 1 < n && visited[i][j + 1] == 0 && board[i][j + 1] == 1)
            findPath(i, j + 1, board, visited, path + "R", ans);

        // Move Left
        if (j - 1 >= 0 && visited[i][j - 1] == 0 && board[i][j - 1] == 1)
            findPath(i, j - 1, board, visited, path + "L", ans);

        // Move Up
        if (i - 1 >= 0 && visited[i - 1][j] == 0 && board[i - 1][j] == 1)
            findPath(i - 1, j, board, visited, path + "U", ans);

        // Unmark for backtracking
        visited[i][j] = 0;
    }
}




