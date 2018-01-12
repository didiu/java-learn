/**Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

For example:

Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.

Follow up:
Could you do it without any loop/recursion in O(1) runtime?
*/
package easy;

public class Add_Digits{
  public int addDigits(int num){
    //数学解法
    return num==0?0:(num%9==0?9:num%9);
  }

  public int addDigitsOne(int num){
    //菜鸡解法
    while(Integer.toString(num).length()!=1){
        int snap=0;
        for (int i=Integer.toString(num).length()-1;i>=0;i-- ) {
        snap+=(int)Integer.toString(num).charAt(i)-48;
      }
      num=snap;
    }
    return num;
  }
}
