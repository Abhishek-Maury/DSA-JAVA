import java.util.Stack;

public class DuplicateParaentheses {
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // closing
            int count = 0;
            if (ch == ')') {
                while (s.pop() != '(') {
                    // s.pop();
                    count++;
                }
                if (count < 1) {
                    return true;
                }

            } else {
                // opening
                s.push(ch);
            }

        }
        return false;
    }

    public static void main(String[] args) {
        String str1 = "((a+b))";
        System.out.println(isDuplicate(str1));
    }
}
