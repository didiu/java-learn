package sort;

public class Quick_Sort {

    public int[] quickSort(int[] array){
        qSort(array,0,array.length-1);
        return array;
    }

    private void qSort(int[] array,int low,int high){
        int pivot;
        if (low<high){
            pivot=partition(array,low,high);

            qSort(array,low,pivot-1);
            qSort(array,pivot+1,high);
        }
    }

    private int partition(int[] array, int low, int high) {
        int pivotkey;
        pivotkey=array[low];
        while (low<high) {
            while (low < high && array[high] >= pivotkey)
                high--;
            swap(array,high,low);
            while (low < high && array[low] <= pivotkey)
                low++;
            swap(array,low,high);
        }
        return low;
    }

    private void swap(int[] a, int i, int i1) {
        int j=a[i];
        a[i]=a[i1];
        a[i1]=j;
    }
}
