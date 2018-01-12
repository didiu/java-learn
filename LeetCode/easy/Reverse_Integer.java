package easy;
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
    if (pre) {
      try{
        return Integer.parseInt(""+sb);
      }catch (Exception e) {
        return 0;
      }finally{
        System.out.println("out");
      }
    }else{
      return Integer.parseInt("-"+sb);
    }
  }
}
