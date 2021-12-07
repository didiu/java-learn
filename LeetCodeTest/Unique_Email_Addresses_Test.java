import org.junit.Test;
import Unique_Email_Addresses;

import static org.junit.Assert.assertEquals;

public class Unique_Email_Addresses_Test {



    @Test
    public void run(){
        String[] str={"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        assertEquals(2,new Unique_Email_Addresses().numUniqueEmails(str));
    }
}
