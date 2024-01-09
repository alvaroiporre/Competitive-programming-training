//https://www.codewars.com/kata/550554fd08b86f84fe000a58/train/java
import java.util.*;
public class WhichAreIn { 
	
	public static String[] inArray(String[] array1, String[] array2) {
		ArrayList<String> sol = new ArrayList<String>();
    for(String str1 : array1) {
      for(String str2: array2) {
        if(str2.contains(str1)){
          sol.add(str1);
          break;
        }
      }
    }
    Collections.sort(sol);
    return sol.toArray(new String[0]);
	}
}