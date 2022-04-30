package Himanshu.ctcci.StacksAndQueue;

import java.util.Stack;

public class ValidParentheses {
    static class Solution {
        public boolean isValid(String s) {
            Stack<Character> st = new Stack<Character>();
            for(int i=0; i<s.length(); i++) {
                System.out.println(s.charAt(i));
                if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                    st.push(s.charAt(i));
                }
                else {
                    if(st.isEmpty()) {
                        return false;
                    }
                    char p = st.pop();
                    if(p == '(' && s.charAt(i) != ')') {
                        return false;
                    }
                    else if(p == '{' && s.charAt(i) != '}') {
                        return false;
                    }
                    else if(p == '[' && s.charAt(i) != ']') {
                        return false;
                    }
                }
            }
            return st.isEmpty();
        }
    }
}
