//https://www.codewars.com/kata/5426d7a2c2c7784365000783
import java.util.*;

public class BalancedParens {
    static void generateParenthesis(int left, int right, String s, List<String> answer) {
        if (left == 0 && right == 0) answer.add(s);
        if (left > 0)generateParenthesis(left - 1, right, s + "(", answer);
        if (right > 0 && left < right)generateParenthesis(left, right - 1, s + ")", answer);
    }
  
    public static List <String> balancedParens (int n) {
        List<String> ans = new ArrayList<>();
        String s = "";
        generateParenthesis(n, n, s, ans);
        return ans;
    }
}