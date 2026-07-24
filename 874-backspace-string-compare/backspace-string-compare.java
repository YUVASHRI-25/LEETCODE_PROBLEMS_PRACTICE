import java.util.Stack;

class Solution {
    public boolean backspaceCompare(String s, String t) {

        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        // Process first string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch != '#') {
                stack1.push(ch);
            } else if (!stack1.isEmpty()) {
                stack1.pop();
            }
        }

        // Process second string
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);

            if (ch != '#') {
                stack2.push(ch);
            } else if (!stack2.isEmpty()) {
                stack2.pop();
            }
        }

        return stack1.equals(stack2);
    }
}