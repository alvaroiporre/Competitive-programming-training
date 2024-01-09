//https://www.codewars.com/kata/5592e3bd57b64d00f3000047/java
public class ASum {
	
	public static long findNb(long m) {
		long sum = 0L;
    long i = 1L;
    while(sum <= m){
      sum += (i * i * i);
      if(sum == m) return i;
      i++;
    }
    return -1;
	}	
}