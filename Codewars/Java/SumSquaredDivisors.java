//https://www.codewars.com/kata/55aa075506463dac6600010d
import java.util.ArrayList;

public class SumSquaredDivisors {
	
	public static String listSquared(long m, long n) {
		ArrayList<String> res = new ArrayList<String>(); 
    for(long i = m; i <= n; i++){
       Long sum = 1L;
       for(Long j = 2L; j * j <= i; j++){
         if(i % j == 0L){
           sum += j * j;
           if(j != i / j){
             sum += (i / j) * (i / j);
           }
         }
       }
       if(i != 1L) sum += i * i;
       Long x = (long)(Math.sqrt(sum)); 
       if(x * x == sum){
         res.add("[" + i + ", " + sum + "]");
       }
     }
    String sol = "[]";
    if(res.size() > 0){
      sol = "[" + String.join(", ", res) + "]";
    }
    return res.toString();
	} 
}