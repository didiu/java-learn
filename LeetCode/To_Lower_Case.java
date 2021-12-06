/**
 *
 * Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.
 *
 *
 *
 * Example 1:
 *
 * Input: "Hello"
 * Output: "hello"
 * Example 2:
 *
 * Input: "here"
 * Output: "here"
 * Example 3:
 *
 * Input: "LOVELY"
 * Output: "lovely"
 * */

public class To_Lower_Case {
        public String toLowerCase(String str) {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                    sb.append((char)(str.charAt(i) + 32));
                    continue;
                }
                sb.append(str.charAt(i));
            }

            return sb.toString();
        }

}
