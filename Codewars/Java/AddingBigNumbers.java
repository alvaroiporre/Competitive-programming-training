//https://www.codewars.com/kata/525f4206b73515bffb000b21/
import static org.apache.commons.lang3.StringUtils.stripStart;

public class Kata {
  public static String add(String a, String b) {
    int sa = a.length();
    int sb = b.length();
    int sizeSol = Math.max(sa,sb);
    String sol = "";
    String rest = "0";
    for(int i = sizeSol - 1; i >= 0; i--) {
      int aAux = (sa - 1 >= 0? Integer.parseInt(a.substring(sa - 1, sa--)):0);
      int bAux = (sb - 1 >= 0? Integer.parseInt(b.substring(sb - 1, sb--)):0);
      int n = Integer.parseInt(rest) + aAux + bAux;
      if(n < 10){
        sol = Integer.toString(n) + sol;
        rest = "0";
      } else {
        rest = Integer.toString((int)(n/10));
        sol = Integer.toString(n%10) + sol;
      }
    }
    if(!rest.equals("0")) sol = rest + sol;
    return stripStart(sol, "0");
  }
}