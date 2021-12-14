import java.util.List;

public class Num120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int res=Integer.MAX_VALUE;
        if(n==1) return triangle.get(0).get(0);

        int[][] dp=new int[n][n];
        dp[0][0]=triangle.get(0).get(0);

        for(int i=1; i<n; i++){
            dp[i][0]=dp[i-1][0] + triangle.get(i).get(0);
            for(int j=1; j<i; j++){
                dp[i][j]=Math.min(dp[i-1][j-1],dp[i-1][j]) + triangle.get(i).get(j);
            }
            dp[i][i]=dp[i-1][i-1] + triangle.get(i).get(i);
        }
        for(int i=0;i<n;i++){
            res=Math.min(dp[n-1][i],res);
        }
        return res;
    }
}
