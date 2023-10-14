package Algorithms.Flood_fill;



/*
 * This class in the solution for the leetcode problem "Flood fill":
 * An image is represented by an m x n integer grid image where image[i][j] represents the pixel value of the image.
 * You are also given three integers sr, sc, and color. You should perform a flood fill on the image starting from the pixel image[sr][sc].
 * To perform a flood fill, consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of the same color as 
 * the starting pixel, plus any pixels connected 4-directionally to those pixels (also with the same color), and so on. Replace the color 
 * of all of the aforementioned pixels with color.
 * Return the modified image after performing the flood fill.
 * 
 * 
 * Constraints:
 * m == image.length
 * n == image[i].length
 * 1 <= m, n <= 50
 * 0 <= image[i][j], color < 216
 * 0 <= sr < m
 * 0 <= sc < n
 */
class Solution {
    boolean[][] visited;
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        visited = new boolean[image.length][image[0].length];
       fill(image, sr, sc, color);
       return image;
    }

    private void  fill(int[][] image, int sr, int sc, int color)
    {
        visited[sr][sc] = true;
         if(sr > 0 && image[sr][sc] == image[sr - 1][sc] && !visited[sr - 1][sc])
       {
            fill(image, sr - 1, sc, color);
       }
       if(sc < image[0].length - 1 && image[sr][sc] == image[sr][sc + 1] && !visited[sr][sc + 1])
       {
            fill(image, sr, sc + 1, color);
       }
       if(sr < image.length - 1 && image[sr][sc] == image[sr + 1][sc] && !visited[sr + 1][sc])
       {
            fill(image, sr + 1, sc, color);
       }
        if(sc > 0 && image[sr][sc] == image[sr][sc - 1] && !visited[sr][sc - 1])
       {
            fill(image, sr, sc - 1, color);
       }

       image[sr][sc] = color;
    }
}
