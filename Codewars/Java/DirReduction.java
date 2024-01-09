//https://www.codewars.com/kata/550f22f4d758534c1100025a/java
import java.util.*;
public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        Stack<String> stack = new Stack<String>();
      
        for(int i = 0; i < arr.length; i++) {
          if(!stack.empty() && ((stack.peek().toLowerCase().equals("east") && arr[i].toLowerCase().equals("west"))
                  || (stack.peek().toLowerCase().equals("west") && arr[i].toLowerCase().equals("east"))
                  || (stack.peek().toLowerCase().equals("south") && arr[i].toLowerCase().equals("north"))
                  || (stack.peek().toLowerCase().equals("north") && arr[i].toLowerCase().equals("south")))) {
            stack.pop();
          }else {
            stack.push(arr[i]);
          }
        }
      
        Vector<String> sol = new Vector<String>();
        while(!stack.empty()){
          sol.add(0, stack.pop());
        }
      
        return sol.toArray(new String[0]);
    }
}