import org.jetbrains.annotations.NotNull;

import java.util.LinkedList;
import java.util.Queue;

public class Num733 {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        dfs(image,sr,sc,newColor,image[sr][sc]);
        return image;
    }
    private void dfs(int[][] image, int sr, int sc, int newColor,int oldColor){
        if(sr<0||sr>=image.length||sc<0||sc>=image[0].length
                ||image[sr][sc]!=oldColor||newColor==oldColor){
            return ;
        }

        image[sr][sc]=newColor;

        dfs(image,sr+1,sc,newColor,oldColor);
        dfs(image,sr-1,sc,newColor,oldColor);
        dfs(image,sr,sc+1,newColor,oldColor);
        dfs(image,sr,sc-1,newColor,oldColor);
    }

    public int[][] floodFill1(int[][] image, int sr, int sc, int newColor) {
        int[] dx=new int[]{0,0,1,-1};
        int[] dy=new int[]{1,-1,0,0};
        int oldColor=image[sr][sc];
        if (oldColor == newColor) {
            return image;
        }
        Queue<int[]> queue=new LinkedList<>();
        queue.offer(new int[]{sr,sc});
        image[sr][sc]=newColor;
        while(!queue.isEmpty()){
            int[] arr=queue.poll();
            int x=arr[0],y=arr[1];
            for(int i=0;i<4;i++){
                int newX=x+dx[i],newY=y+dy[i];
                if( newX>=0&&newX<image.length&&newY>=0&&newY<image[0].length&&image[newX][newY]==oldColor){
                    queue.offer(new int[]{newX,newY});
                    image[newX][newY]=newColor;
                }
            }
        }
        return image;
    }
}
