package Algorithms.Flood_fill;

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
      
       fill(image, sr, sc, color);
       return image;
    }

    private void  fill(int[][] image, int sr, int sc, int color)
    {
         if(sr > 0 && image[sr][sc] == image[sr - 1][sc])
       {
            floodFill(image, sr - 1, sc, color);
       }
       if(sc < image[0].length - 1 && image[sr][sc] == image[sr][sc + 1])
       {
            floodFill(image, sr, sc + 1, color);
       }
       if(sr < image.length - 1 && image[sr][sc] == image[sr + 1][sc])
       {
            floodFill(image, sr + 1, sc, color);
       }
        if(sc > 0 && image[sr][sc] == image[sr][sc - 1])
       {
            floodFill(image, sr, sc - 1, color);
       }

       image[sr][sc] = color;
    }
}
