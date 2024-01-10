//https://www.codewars.com/kata/576757b1df89ecf5bd00073b
public class Kata
{
  public static String[] towerBuilder(int nFloors)
  {
    String[] sol = new String[nFloors];
    for(int i = 0; i < nFloors; i++) {
      sol[i] = " ".repeat(nFloors - i - 1) + "*".repeat(i) + "*" + "*".repeat(i) + " ".repeat(nFloors - i - 1);
    }
    return sol;
  }
}

// public class Kata {
//     public static String[] towerBuilder(int nFloors) {
//         String[] tower = new String[nFloors];
//         for (int i = 0; i < nFloors; i++)
//             tower[i] = " ".repeat(nFloors - i - 1) + "*".repeat(i * 2 + 1) + " ".repeat(nFloors - i - 1);
//         return tower;
//     }
// }