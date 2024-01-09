//https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1/train/java
import java.util.Arrays;

public class CountingDuplicates {
  public static int duplicateCount(String text) {
    text = text.toLowerCase();
    int[] values = new int[200];
    Arrays.fill(values, 0);
    int sol = 0;
    for(int i = 0; i < text.length(); i++) {
      values[text.charAt(i) - '0']++;
    }
    for(int i: values){
      if(i > 1) sol++;
    }
    return sol;
  }
}