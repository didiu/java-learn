package easy;

import org.junit.Test;

public class Valid_Parentheses_Test {
    @Test
    public void run(){
        String s="()()()()(){}{}{}[][][]";
        String s1="(((({{{{[[[[]]]]}}}}))))";
        String s3="";
        String s4="({)}";
        System.out.println(new Valid_Parentheses().solution(s));
        System.out.println(new Valid_Parentheses().solution(s1));
        System.out.println(new Valid_Parentheses().solution(s3));
        System.out.println(new Valid_Parentheses().solution(s4));
    }
}
