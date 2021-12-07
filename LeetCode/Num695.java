import org.junit.jupiter.api.Test;

public class Num695 {
    public int maxAreaOfIsland(int[][] grid) {
        int maxLand=0;
        for(int i=0;i<grid.length;i++){
            for (int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    maxLand=Math.max(maxLand, dfs(grid,i,j));
                }
            }
        }
        return maxLand;
    }

    private int  dfs(int[][] image, int sr, int sc){
        if(sr<0||sr>=image.length||sc<0||sc>=image[0].length
                ||image[sr][sc]!=1){
            return 0;
        }
        image[sr][sc]=2;
        int ans=1;
        ans += dfs(image,sr+1,sc);
        ans += dfs(image,sr-1,sc);
        ans += dfs(image,sr,sc+1);
        ans += dfs(image,sr,sc-1);

        return ans;
    }

    @Test
    void run(){
        int[][] gird=new int[][]{
                {0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0}};
        System.out.println(new Num695().maxAreaOfIsland(gird));
    }
}
