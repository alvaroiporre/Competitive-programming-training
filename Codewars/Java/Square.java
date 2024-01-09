//https://www.codewars.com/kata/54c27a33fb7da0db0100040e/java
public class Square {    
    public static boolean isSquare(int n) {        
        for(int i = 0 ; i * i <= n; i++) {
          if(i * i == n) return true;
        }
        return false;
    }
}
// import static java.lang.Math.*;
// public class Square {    
//     public static boolean isSquare(int n) {      
//         return Math.sqrt(n) % 1 == 0;
//     }
// }