package easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Num372 {
    int MOD=1337;
    public int superPow(int a, int[] b) {
        return dfs(a,b,b.length-1);
    }
    private int dfs(int a, int[] b, int u){
        if(u==-1) return 1;
        return qpow(dfs(a,b,u-1),10)*qpow(a,b[u])%MOD;
    }
    private int qpow(int a,int b){
        int ans=1;
        a%=MOD;
        while(b!=0){
            if((b&1)!=0) ans=ans*a%MOD;
            a=a*a%MOD;
            b>>=1;
        }
        return ans;
    }
    @Test
    @DisplayName(" 快速幂解法")
    void run(){
        assertEquals(1198,new Num372().superPow(2147483647, new int[]{2, 0, 0}));
    }
}
