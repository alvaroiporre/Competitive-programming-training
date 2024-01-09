//https://www.codewars.com/kata/5390bac347d09b7da40006f6/train/java
public class JadenCase {

	public String toJadenCase(String phrase) {
    if(phrase == null || phrase.length() == 0) return null;
    String[] list = phrase.split(" ");
		for(int i=0; i < list.length; i++){
      list[i] = list[i].substring(0,1).toUpperCase() + list[i].substring(1);
    }		
		return String.join(" ", list);
	}

}