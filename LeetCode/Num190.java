public class Num190 {
    public int reverseBits(int n) {
        int res=0;
        for(int i=0;i<32;i++){
            if((n&(1<<i))!=0){
                res|=1<<(32-i-1);
            }
        }
        return res;
    }
}
