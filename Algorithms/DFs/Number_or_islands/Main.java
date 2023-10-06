package Algorithms.DFs.Number_or_islands;
public class Main {
    public static void main(String[] args) {
        
        Solution sol = new Solution();
        char[][] array ={
            {'1','1','1','1','1'},
            {'0','1','1','1','1'},
            {'1','0','0','0','0'},
            {'1','1','1','1','0'},
        };
        
            System.out.println(sol.numIslands(array));
    }
    
}
