import java.util.LinkedList;
import java.util.Queue;

public class Num994 {
    static int[] row=new int[]{0,0,1,-1};
    static int[] col=new int[]{1,-1,0,0};
    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue=new LinkedList<>();
        int sum=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2) queue.offer(new int[]{i,j});
                if(grid[i][j]==1) sum++;
            }
        }
        int minutes=0;
        while(!queue.isEmpty()){
            int n=queue.size();
            for(int i=0;i<n;i++){
                int[] amp=queue.poll();
                for(int j=0;j<4;j++){
                    assert amp != null;
                    int r=amp[0]+row[j];
                    int c=amp[1]+col[j];
                    if(r<grid.length&&r>=0&&c<grid[0].length&&c>=0&&grid[r][c]==1){
                        queue.offer(new int[]{r,c});
                        grid[r][c]=2;
                        sum--;
                    }
                }
            }
            minutes++;
        }
        if(minutes!=0) minutes-=1;
        // return minutes;
        return sum==0?minutes:-1;
    }
}
