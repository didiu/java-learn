/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 * Example 1:
 *
 * Input: ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 *
 * Input: ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * Note:
 *
 * All given inputs are in lowercase letters a-z.
 *
 * */

public class Longest_Common_Prefix {
    //错误的代码
    public String soulution(String[] strs){
        boolean flag=false;
        StringBuilder stringBuffer=new StringBuilder();
        for (int j=0;j<strs[0].length();j++){
            try {
                for (String str : strs) {
                    if (strs[0].charAt(j) == str.charAt(j)) {
                        flag = true;
                    } else {
                        return stringBuffer.toString();
                    }
                }
            }
            catch(StringIndexOutOfBoundsException e){
                return stringBuffer.toString();
            }

            if (flag){
                stringBuffer.append(strs[0].charAt(j));
            }
        }
        return stringBuffer.toString();
    }
    //抄的答案
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }
}
