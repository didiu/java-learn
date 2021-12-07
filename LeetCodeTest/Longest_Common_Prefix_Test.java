import org.junit.Test;

public class Longest_Common_Prefix_Test {
    private String[] strings=new String[]{"ssss","sssr","ssdr"};
    private String[] strings1=new String[]{"adad","adad","adad"};
    private String[] strings2=new String[]{"flower","flow","flight"};

    @Test
    public void run(){
      //  System.out.println(new Longest_Common_Prefix().soulution(strings));
        //System.out.println(new Longest_Common_Prefix().soulution(strings1));
        System.out.println(new Longest_Common_Prefix().soulution(strings2));
    }

    @Test
    public void run1(){
        System.out.println(new Longest_Common_Prefix().longestCommonPrefix(strings2));
    }
}
