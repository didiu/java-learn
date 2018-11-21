package easy.array;

public class Monotonic_Array {
    public boolean isMonotonic(int[] A) {
        return isUp(A)||isDown(A);
    }
    private boolean isUp(int[] A){
        for(int i=0;i<A.length-1;i++){
            if(A[i]>A[i+1]) return false;
        }
        return true;
    }
    private boolean isDown(int[] A){
        for(int i=0;i<A.length-1;i++){
            if(A[i]<A[i+1]) return false;
        }
        return true;
    }
}
