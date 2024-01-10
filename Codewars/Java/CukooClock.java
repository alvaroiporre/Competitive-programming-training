//https://www.codewars.com/kata/656e4602ee72af0017e37e82/train/java
public class CuckooClock {
  public static String cuckooClock(String inputTime, int chimes) {
    int h = Integer.parseInt(inputTime.substring(0,2));
    int m = Integer.parseInt(inputTime.substring(3,5));
    int cont = 0;
    while(cont <= chimes){
      if(m == 0){
        cont += h;
      }else if(m % 15 == 0) {
        cont++;
      }
      if(cont >= chimes)break;
      m++;
      h+=(m/60);
      if(h>12) h-=12;
      m%=60;
    }
    
    String sh = (h < 10? "0" + h : h + "" );
    String sm = (m < 10? "0" + m : m + "" );
    return sh + ":" + sm;
    }
}