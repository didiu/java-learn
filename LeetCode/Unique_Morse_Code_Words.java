/**
 * International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows: "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.
 *
 * For convenience, the full table for the 26 letters of the English alphabet is given below:
 *
 * [".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
 * Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter. For example, "cba" can be written as "-.-..--...", (which is the concatenation "-.-." + "-..." + ".-"). We'll call such a concatenation, the transformation of a word.
 *
 * Return the number of different transformations among all words we have.
 *
 * Example:
 * Input: words = ["gin", "zen", "gig", "msg"]
 * Output: 2
 * Explanation:
 * The transformation of each word is:
 * "gin" -> "--...-."
 * "zen" -> "--...-."
 * "gig" -> "--...--."
 * "msg" -> "--...--."
 *
 * There are 2 different transformations, "--...-." and "--...--.".
 * Note:
 *
 * The length of words will be at most 100.
 * Each words[i] will have length in range [1, 12].
 * words[i] will only consist of lowercase letters.
 *
 *
 * 他这个描述有问题.
 * 题意是将单词转为电报形式,不同单词可能位同一电报.
 * 给一单词数组,求多少电报形式
 * 他举例错误了
 *
 * */

import java.util.HashSet;
import java.util.Set;

public class Unique_Morse_Code_Words {
    public int uniqueMorseRepresentations(String[] words) {
        if (words.length == 0) return 0;
        if (words.length == 1) return 1;

        String[] str = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        Set<String> set = new HashSet();

        for (String newWords : words) {

            StringBuffer sb = new StringBuffer();
            for (char ch : newWords.toCharArray()) {

                //a对应97,A对应65.
                sb.append(str[ch - 97]);
            }

            set.add(sb.toString());
        }

        return set.size();

    }
}
