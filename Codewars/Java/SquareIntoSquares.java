//https://www.codewars.com/kata/54eb33e5bc1a25440d000891/train/java
import java.util.*;
public class Decompose {
  public String decompose(long n) {
    return decomposer("", n - 1, n * n).strip();
  }
  
  public String decomposer(String res, long n, long total){
    if(total == 0) return res;
    if(n == 0 || total < 0) return null;
    
    String x = decomposer( String.valueOf(n) + " " + res , n - 1, total - (n * n));
    String y = decomposer(res, n - 1, total);
    //System.out.println(x + ", " + y);
    return x == null ? y: x;
  }
}