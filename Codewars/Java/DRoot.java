//https://www.codewars.com/kata/541c8630095125aba6000c00/train/java
public class DRoot {
  public static int digital_root(int n) {
    while(n > 9){
      int aux = 0;
      while(n > 0){
        aux += n % 10;
        n /= 10;
      }
      n = aux;
    }
    return n;
  }
}

// public class DRoot {
//   public static int digital_root(int n) {
//     return (n != 0 && n%9 == 0) ? 9 : n % 9;
//   }
// }