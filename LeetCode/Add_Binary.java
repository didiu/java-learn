/**
 * Given two binary strings, return their sum (also a binary string).
 * <p>
 * For example,
 * a = "11"
 * b = "1"
 * Return "100".
 */

import java.util.HashMap;
import java.util.Map;

class Add_Binary {

    String addBinary(String a, String b) {
        if (a.equals("0") && b.equals("0")) {
            return "0";
        } else {
            StringBuilder sb = new StringBuilder();
            int i = a.length() - 1, j = b.length() - 1, sum = 0;
            while (i >= 0 || j >= 0) {
                sum = sum / 2;
                if (i >= 0) sum += a.charAt(i--) - 48;
                if (j >= 0) sum += b.charAt(j--) - 48;
                sb.append(sum % 2);
            }
            if (sum / 2 != 0) {
                sb.append(1);
            }
            return sb.reverse().toString();
        }
    }
}
