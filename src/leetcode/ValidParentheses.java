package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {

        boolean resultado = true;
        Stack<Character> e = new Stack<>();

        for (int i = 0; i < s.length() - 1; i++) {
            e.push(s.charAt(i));
        }
        Character a;
        Character b;
        for (int i = e.size()-1; i > 0; i--) {
            a = e.get(i);
            b = e.peek();
            switch (a) {
                case ')':
                    if (e.peek() == '(') {
                        e.pop();
                    } else {
                        return false;
                    }
                    break;
                case '}':
                    if (e.peek() == '}') {
                        e.pop();
                    } else {
                        return false;
                    }
                    break;
                case ']':

                    if (e.peek() == ']') {
                        e.pop();
                    } else {
                        return false;
                    }
                    break;
            }
        }

        return resultado;
    }
}
