//https://www.codewars.com/kata/5426d7a2c2c7784365000783
import java.util.*;

public class BalancedParens {
    static void generateParenthesis(int left, int right, String s, List<String> answer) {
        if (left == 0 && right == 0) answer.add(s);
 
        if (left > right || left < 0 || right < 0) return;
 
        s += "(";
        generateParenthesis(left - 1, right, s, answer);
        s = s.substring(0, s.length() - 1);
 
        s += ")";
        generateParenthesis(left, right - 1, s, answer);
        s = s.substring(0, s.length() - 1);
    }
  
    public static List <String> balancedParens (int n) {
        List<String> ans = new ArrayList<>();
        String s = "";
        generateParenthesis(n, n, s, ans);
        return ans;
    }
}