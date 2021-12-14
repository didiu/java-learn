public class Num191 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int res=0;
        while(n!=0){
            n=n&(n-1);
            res++;
        }
        return res;
    }
    public static void main(String[] args){
        System.out.println(new Num191().hammingWeight(0b11111111111111111111111111111101));
    }
}
