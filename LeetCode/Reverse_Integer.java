/**
Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output:  321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
Note:
Assume we are dealing with an environment which could only hold integers within the
32-bit signed integer range. For the purpose of this problem, assume that your function
returns 0 when the reversed integer overflows.
*/

public class Reverse_Integer{
  public int reverseInteger(int num){
    boolean pre=false;
    if (num<0) {
      num=Math.abs(num);
      pre=false;
    }else pre=true;
      StringBuilder sb=new StringBuilder();
      for (int i=Integer.toString(num).length()-1;i>=0 ;i--) {
      sb.append(Integer.toString(num).charAt(i)-48);
    }
    try {
        Integer.parseInt(""+sb);
    }catch (Exception e){
        return 0;
    }finally {

    }
    if (pre) {
        return Integer.parseInt(""+sb);
    }else{
      return Integer.parseInt("-"+sb);
    }
  }

  public int reverseIntegerTwo(int num){
    long out=0;
    while(num!=0){
      out=out*10+num%10;
      num=num/10;
    }
    if (out>Integer.MAX_VALUE||out<Integer.MIN_VALUE) return 0;
    return (int)(out);
  }
}
