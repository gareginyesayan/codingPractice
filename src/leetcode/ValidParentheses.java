package leetcode;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {

        String paren = "[]{}(){()}((())){{{}}}{()()}{{}{}}";
//        if (paren.equals("(([](){})])")) return;
        System.out.println(isValid(paren));


    }

    public static boolean isValid(String s) {
        if (s.length() == 0) return true;
        boolean flag = true;
        Character c;
        Stack<Character> st = new Stack<>();
        //add string chars to stack. Once closing bracket verify correctness and pop from previous from stack
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            System.out.println(st);

            switch (c) {
                case '(':
                    st.push(c);
                    break;
                case ')':
                    if(st.empty() && "]})".contains(c.toString())) return false;
                    if (st.peek() == '(') {
                        st.pop();
                    } else if ("]})".contains(st.peek().toString())) {
                        st.push(c);
                    } else flag = false;
                    break;
                case '[':
                    st.push(c);
                    break;
                case ']':
                    if(st.empty() && "]})".contains(c.toString())) return false;
                    if (st.peek() == '[') {
                        st.pop();
                    } else if ("]})".contains(st.peek().toString())) {
                        st.push(c);
                    } else flag = false;
                    break;
                case '{':
                    st.push(c);
                    break;
                case '}':
                    if(st.empty() && "]})".contains(c.toString())) return false;
                    if(st.peek()=='{'){
                        st.pop();
                    }
                    else if("]})".contains(st.peek().toString())){
                        st.push(c);
                    } else flag = false;
                    break;
            }
        }
        if(!st.empty()) flag=false;


        return flag;

    }


}
