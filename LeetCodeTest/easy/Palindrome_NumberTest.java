package easy;

import org.junit.Test;

public class Palindrome_NumberTest {
    @Test
    public void soultionTest(){
        System.out.println(new Palindrome_Number().soultion(-11211));
        System.out.println(new Palindrome_Number().soultion(121));
        System.out.println(new Palindrome_Number().soultion(11212));
        System.out.println(new Palindrome_Number().soultion(11211));
        System.out.println(new Palindrome_Number().soultion(1000021));
    }
    @Test
    public void soultionTest1(){
        System.out.println(new Palindrome_Number().soultion1(-11211));
        System.out.println(new Palindrome_Number().soultion1(121));
        System.out.println(new Palindrome_Number().soultion1(11212));
        System.out.println(new Palindrome_Number().soultion1(11211));
        System.out.println(new Palindrome_Number().soultion1(1000021));
    }
}
