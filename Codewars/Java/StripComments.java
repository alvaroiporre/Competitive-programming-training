//https://www.codewars.com/kata/51c8e37cee245da6b40000bd/train/java
public class StripComments {

	public static String stripComments(String text, String[] commentSymbols) {
    String comments = String.join("", commentSymbols);
    String[] aux = text.split("\n");
    for (int j = 0; j < aux.length; j++) {
      String res = "";
      for (int i = 0; i < aux[j].length(); i++) {
        if(comments.contains(aux[j].substring(i, i + 1))) break;
        res += aux[j].substring(i, i + 1);
      }
      aux[j] = res.stripTrailing();
    }
		return "".join("\n", aux);
	}
}