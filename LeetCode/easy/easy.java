package easy;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class easy {


    /**
     * part20 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
     *
     * 有效字符串需满足：
     *
     * 左括号必须用相同类型的右括号闭合。
     * 左括号必须以正确的顺序闭合。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/valid-parentheses
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param s
     * @return
     */
    public boolean isValid(String s) {
        Stack<Character> stack =new Stack<>();
        for(Character c:s.toCharArray()){
            if (c=='(') stack.push(')');
            else if (c=='[') stack.push(']');
            else if (c=='{') stack.push('}');
            else if (stack.isEmpty()||c!=stack.pop()) return false;

        } return stack.isEmpty();
    }
    public int removeDuplicates(int[] nums) {
        int length=nums.length;
        for (int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]==nums[j]) {
                    nums[j]=Integer.MAX_VALUE;
                    length-=1;
                }
            }
        }
        Arrays.sort(nums);
        return length;
    }
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int [] sum=new int[nums.length/2];
        for(int i=0;i< nums.length/2; i++){
            sum[i]=nums[i]+nums[nums.length-i-1];
        }
        int minPairsum=0;
        for(int k:sum){
            if(k>minPairsum) minPairsum=k;
        }
        String ss;

        return minPairsum;
    }

    public int myAtoi(String str) {

            Automaton automaton = new Automaton();
            int length = str.length();
            for (int i = 0; i < length; ++i) {
                automaton.get(str.charAt(i));
            }
            return (int) (automaton.sign * automaton.ans);

    }


    @Test
    void run(){
        assertEquals(0,new easy().myAtoi("words and 987"));
    }

    public boolean isPalindrome(int x) {
        if(x<0) return false;
        if(x%10==0&&x!=0) return false;
        int y=0;
        while(y<x){
            y=y*10+x%10;
            x/=10;
        }
        if(y==x) return true;
        else return false;
    }
    @Test
    void run1(){
//        assertEquals(false,new easy().isPalindrome(123));
        System.out.println(Integer.parseInt("0")-Integer.parseInt("1"));
        System.out.println( compareVersion("1","1.1"));
        int[] nums=new int[]{1};
        swap(nums,0,0);
        System.out.println( nums[0]);
    }
    private void swap(int[] nums,int i, int j){

        nums[i]=nums[i]^nums[j];
        nums[j]=nums[i]^nums[j];
        nums[i]=nums[i]^nums[j];
    }
    public int compareVersion(String version1, String version2) {
        String[] v1=version1.split("\\.");
        String[] v2=version2.split("\\.");

        for(int i=0,j=0; i<v1.length&&j<v2.length;i++,j++){
            int temp=compareString(v1[i],v2[j]);
            if(temp!=0) return temp;
        }

        if(v1.length>v2.length) return 1;
        if(v1.length<v2.length) return -1;
        return 0;
    }

    private int compareString(String v1,String v2){
        int res= Integer.parseInt(v1)-Integer.parseInt(v2);
        if(res>0) return 1;
        if(res<0) return -1;
        return 0;
    }
    //11
    public int maxArea(int[] height) {
        int l=0,r=height.length-1;
        int ans=0;
        while (l<r){
            int area=Math.min(height[l],height[r])*(r-l);
            ans=Math.max(area,ans);
            if(height[l]<height[r]) ++l;
            else --r;
        }
        return ans;
    }

    public ListNode middleNode(ListNode head) {
        ListNode newHead =head;
        int temp=0;
        while (newHead!=null){
            temp++;
            newHead=newHead.next;
        }
        newHead=head;
        int i=temp/2;
        while(i-->0){
            newHead=newHead.next;
        }
        return newHead;
    }
    @Test
    void run2(){
        ListNode head=new ListNode(1,null);
        head.next=new ListNode(2,null);
        head.next.next=new ListNode(3,null);
        head.next.next.next=new ListNode(4,null);
        head.next.next.next.next=new ListNode(5,null);
//        assertEquals(false,new easy().isPalindrome(123));
        ListNode ss=middleNode(head);
        while (ss!=null){
            System.out.println(ss.val);
            ss=ss.next;
        }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode l=new ListNode(0,head);
        ListNode r=new ListNode(0,head);
        ListNode s=l;
        while(r.next!=null){
            r=r.next;
            if(n--<=0)
                l=l.next;
        }
        Queue<Character> queue=new LinkedList<>();
        queue.contains('s');
        queue.size();
        l.next=l.next.next;
        return s.next;
    }
    @Test
    void run3(){
        ListNode head=new ListNode(1,null);
        ListNode ss=removeNthFromEnd(head,1);
        while (ss!=null){
            System.out.println(ss.val);
            ss=ss.next;
        }
    }
}
class Automaton {
    public int sign = 1;
    public long ans = 0;
    private String state = "start";
    private Map<String, String[]> table = new HashMap<>() {{
        put("start", new String[]{"start", "signed", "in_number", "end"});
        put("signed", new String[]{"end", "end", "in_number", "end"});
        put("in_number", new String[]{"end", "end", "in_number", "end"});
        put("end", new String[]{"end", "end", "end", "end"});
    }};
    public void get(char c) {
        state = table.get(state)[get_col(c)];
        if ("in_number".equals(state)) {
            ans = ans * 10 + c - '0';
            ans = sign == 1 ? Math.min(ans, (long) Integer.MAX_VALUE) : Math.min(ans, -(long) Integer.MIN_VALUE);
        } else if ("signed".equals(state)) {
            sign = c == '+' ? 1 : -1;
        }
    }

    private int get_col(char c) {
        if (c == ' ') {
            return 0;
        }
        if (c == '+' || c == '-') {
            return 1;
        }
        if (Character.isDigit(c)) {
            return 2;
        }
        return 3;
    }

    public String longestCommonPrefix(String[] strs) {
        Map<Character,char[]> map=new HashMap<>(){{
            put('2', new char[]{'a', 'b', 'c'});
        }};
        StringBuffer bf=new StringBuffer();
        for(int i=0;i<strs[0].length();i++){
            bf.append(strs[1].charAt(i));
            for(int j=1;j<strs.length;j++){
                if(strs[1].charAt(i)!=strs[j].charAt(i))
                    return bf.toString();
            }

        }
        return bf.toString();
    }
    public int reverse(int x) {
        int y=0;
        while (x!=0){
            if(Math.abs(y)>(Integer.MAX_VALUE-Math.abs(x)%10)/10){
                return 0;
            }
            y=y*10+x%10;
            x=x/10;
        }
        return y;
    }
    public int firstUniqChar(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else map.put(s.charAt(i),1);
        }
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1) return i;
        }
        return -1;
    }
    public boolean isPalindrome(String s) {

        if(s.trim()=="") return true;
        int i=0,j=s.length()-1;
        s=s.toLowerCase();
        while (i<j){
            if(!Character.isLetterOrDigit(s.charAt(i))){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(j))){
                j--;
                continue;
            }
            if(s.charAt(i)!=s.charAt(j)) return false;
            else{
                i++;
                j--;
            }
        }
        return true;

    }
    public ListNode reverseList(ListNode head) {
        ListNode newHead=null;
        ListNode temp=null;
        while(head!=null){
            temp=head.next;
            head.next=newHead;
            newHead=head;
            head=temp;
        }
        return newHead;
    }



    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();

        Queue<TreeNode> queue=new ArrayDeque<>();
        if(root!=null) queue.add(root);

        while(!queue.isEmpty()){
            int n=queue.size();
            List<Integer> level=new ArrayList<>();
            while(n-->0){
                TreeNode node=queue.poll();
                level.add(node.val);
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
            }
            res.add(level);
        }
        return res;
    }
    public int minimumSwitchingTimes(int[][] source, int[][] target) {
        int min=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int[] str:source){
            for(int s:str){
                if(map.containsKey(s)){
                    map.put(s,map.get(s)+1);
                }else map.put(s,1);
            }
        }

        for(int[] str:target){
            for(int s:str){
                if(map.containsKey(s)){
                    if(map.get(s)<=0){
                        min+=1;
                    }else map.put(s,map.get(s)-1);
                }else min+=1;
            }
        }
        return min;
    }
    public String findLongestWord(String s, List<String> dictionary) {
        String res="";
        for(String str:dictionary){
            int m=0,n=0;
            while(m<s.length()&&n<str.length()){
                if(s.charAt(m)==str.charAt(n)) n++;
                m++;
            }
            if(n==str.length()){
                if(str.length()>res.length()||(str.length()==res.length()&&str.compareTo(res)<0))
                    res=str;
            }
        }

        return res;
    }

    public boolean isValidSudoku(char[][] board) {
        int[][] row=new int[9][9];
        int[][] col=new int[9][9];
        int[][][] minbox=new int[3][3][9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char c=board[i][j];
                if(c!='.'){
                    int index=c-'0'-1;
                    row[i][index]++;
                    col[j][index]++;
                    minbox[i/3][j/3][index]++;
                    if(row[i][index]>1 || row[j][index]>1 || minbox[i/3][j/3][index]>1){
                        return false;
                    }
                }
            }
        }
        return true;

    }



}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}