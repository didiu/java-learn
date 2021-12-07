import java.util.LinkedList;
import java.util.Queue;

public class Num3 {
    public int lengthOfLongestSubstring(String s) {
        Queue<Character> queue=new LinkedList<>();
        int res=0;
        for(int i=0;i<s.length();i++){
            Character c=s.charAt(i);
            if(queue.contains(c)){
                while(queue.poll()!=c) {
                }
            }
            queue.add(c);
            res=Math.max(res,queue.size());
        }
        return res;
    }
}
