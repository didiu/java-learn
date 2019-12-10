package sort;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * 归并排序
 */
class MergeSort {
    private void mergeSort(int[] A,int p,int r){
        if (p<r){
            int q=(p+r)/2;
            mergeSort(A,p,q);
            mergeSort(A,q+1,r);
            merge(A,p,q,r);
        }
    }
    private void merge(int[] A,int p,int q, int r ){
        int n1=q-p+1;
        int n2=r-q;

        int[] left=new int[n1+1];
        int[] right=new int[n2+1];

        System.arraycopy(A, p, left, 0, n1);
        System.arraycopy(A, q + 1, right,0, n2);

        left[n1] =Integer.MAX_VALUE;
        right[n2]=Integer.MAX_VALUE;
        int i=0,j=0;
        for (int k = p; k <r+1; k++) {
            if (left[i]<=right[j]){
                A[k]=left[i];
                i++;
            }else {
                A[k]=right[j];
                j++;
            }
        }


    }

    @Test
    @DisplayName("归并排序测试")
    void run(){
        int[] A=new int[]{5,3,4,2,8,1,9};
        mergeSort(A,0,A.length-1);
        Arrays.stream(A).forEach(z->System.out.print(z+" "));
    }
}
