public class NumberOfIslandsMain {
    public static void main(String[] args){
        char[][] grid = {
            {'1','1','0','1','0'},
            {'1','1','0','0','0'},
            {'0','0','0','0','0'},
            {'1','1','0','1','1'}
        };

    NumberOfIslands solution = new NumberOfIslands();
    int numOfIslands = solution.numIslands(grid);
    System.out.println("Number of Island in the given grid is :" + numOfIslands);
    

    }
    
}
