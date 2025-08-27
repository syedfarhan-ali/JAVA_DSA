package Graphs_Part5;

public class FloodFillLeetcode733 {
    public void helper(int[][] image, int sr, int sc, int color, boolean[][] visited, int orgCol){
        if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || visited[sr][sc] || image[sr][sc] != orgCol){//O(m*n) m is rows , n is cols
            return;
        }
        visited[sr][sc] = true;
        image[sr][sc] = color;
        
        //left 
        helper(image, sr, sc-1, color, visited, orgCol);
        //right
        helper(image, sr, sc+1, color, visited, orgCol);
        //up
        helper(image, sr-1, sc, color, visited, orgCol);
        //down
        helper(image, sr+1, sc, color, visited, orgCol);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color){
        boolean[][] visited = new boolean[image.length][image[0].length];
        helper(image, sr, sc, color, visited, image[sr][sc]);
        return image;
    }
    public static void main(String[] args) {
        
    }
}
