//https://www.codewars.com/kata/5813d19765d81c592200001a
public class Kata
{
  public static int dontGiveMeFive(int start, int end)
  {
    int s=0;
    for (int i = start; i <= end; i++) {
      int aux = i;
      boolean flag = true;
      while(aux != 0){
        if(aux%10 == 5 || aux%10 == -5) {
          flag = false;
          break;
        }
        aux/=10;
      }
      s += (flag? 1:0);
    }
    return s;
  }
}

// public class Kata{
//   public static int dontGiveMeFive(int start, int end){
//     int ans = 0;
//     for (int i = start; i <= end; i++) {
//       if (!("" + i).contains("5")) ans++;
//     }
//     return ans;
//   }
// }