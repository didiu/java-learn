

public class Num911 {
    int[] persons;
    int[] times;
    int[] winners;
    public Num911(int[] persons, int[] times) {
        this.persons=persons;
        this.times=times;
        this.winners=new int[times.length];
        int[] ticks=new int[persons.length];
        int maxTicks=-1;
        for(int i=0;i<times.length;i++){
            ticks[persons[i]]++;
            if(ticks[persons[i]]>=maxTicks){
                winners[i]=persons[i];
                maxTicks=ticks[persons[i]];
            }else{
                winners[i]=winners[i-1];
            }
        }
    }

    public int q(int t) {
        if(t>=times[persons.length-1]){return winners[persons.length-1];}
//        return winners[find(times,t)];
        int l=0,r=persons.length-1;
        while(l<r-1){
            int mid=l+(r-l)/2;
            if(times[mid]>t){r=mid-1;}
            else{l=mid;}
        }
        return times[r]<=t?winners[r]:winners[l];
    }
    private int find(int[] times, int t){
        if(t>=times[times.length-1]) return times.length-1;
        int i=0,j=times.length-1;
        while(i<j){
            int mid=i+(j-i)/2;
            if(times[mid]>t){
                j=mid;
            }else if(times[mid]<t){
                i=mid+1;
            }else return mid;
        }
        return i-1;
    }
    public static void main(String[] args){
        int [] person=new int[]{0,0,0,0,1};
        int [] times=new int[]{0,6,39,52,75};
        Num911 num911=new Num911(person,times);
        System.out.println(num911.q(78));
        System.out.println(num911.find(times,78));
        System.out.println(num911.find(times,5));
        System.out.println(num911.find(times,39));
        System.out.println(num911.find(times,0));


    }
}
