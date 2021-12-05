package easy;


import java.util.Arrays;
import java.util.Comparator;

public class Nums1005 {

    public int largestSumAfterKNegations(int[] nums, int k) {
        int res=0;
        Integer[] num=new Integer[nums.length];
        for(int i=nums.length-1; i>=0; --i ){
            num[i]= nums[i];
        }
        Arrays.sort(num, Comparator.comparingInt(Math::abs));
        for(int i=num.length-1; i>=0; --i ){
            if(k==0) break;
            if(num[i]<0){
                num[i]=-num[i];
                --k;
            }
        }
        if(k>0){
            k=k%2==1?-1:1;
            num[0]=k*num[0];
        }
        for(int i=num.length-1; i>=0; --i ){
            res+=num[i];
        }
        return res;
    }

}
