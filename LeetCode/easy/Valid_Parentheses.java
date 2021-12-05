/*
  Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

  An input string is valid if:

  Open brackets must be closed by the same type of brackets.
  Open brackets must be closed in the correct order.
  Note that an empty string is also considered valid.

  Example 1:

  Input: "()"
  Output: true
  Example 2:

  Input: "()[]{}"
  Output: true
  Example 3:

  Input: "(]"
  Output: false
  Example 4:

  Input: "([)]"
  Output: false
  Example 5:

  Input: "{[]}"
  Output: true
  * */
package easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Valid_Parentheses {
    public boolean solution(String s){
        Map<Character,Character> map=new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        Stack<Character> stack=new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                char topElement = stack.isEmpty() ? '#' : stack.pop();
                if (topElement != map.get(s.charAt(i))) return false;
            }
            else stack.push(s.charAt(i));
        }
        return stack.isEmpty();
    }
}
