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

// public class CuckooClock {
  
//   public static String cuckooClock(String inputTime, int chimes) {
//     int hr = Integer.parseInt(inputTime.substring(0,2));
//     int min = Integer.parseInt(inputTime.substring(3,5));
    
//     while (true) {
//       if (min == 0) chimes -= hr; else if (min % 15 == 0) chimes--; // cuckoo!      
//       if (chimes <= 0) return String.format("%02d:%02d", hr, min);  // done
//       if (++min > 59) { min = 0; if (++hr > 12) hr = 1; }           // tick-tock
//     }
//   }
  
// }