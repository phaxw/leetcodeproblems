package easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {

        Stack<Character> e = new Stack<>();
        Character character = '0';

        if ((s.length() % 2) != 0) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                e.push(s.charAt(i));
                continue;
            }

            if (e.isEmpty()) {
                return false;
            }

            switch (s.charAt(i)) {
                case ')':
                    character = e.pop();
                    if (character != '(')
                        return false;
                    break;
                case '}':
                    character = e.pop();
                    if (character != '{')
                        return false;
                    break;
                case ']':
                    character = e.pop();
                    if (character != '[')
                        return false;
                    break;
            }
        }

        if (!e.isEmpty()) {
            return false;
        }

        return true;
    }
}
