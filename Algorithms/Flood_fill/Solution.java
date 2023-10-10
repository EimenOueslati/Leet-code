package Algorithms.Flood_fill;

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
