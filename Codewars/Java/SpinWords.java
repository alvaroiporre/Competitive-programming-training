//https://www.codewars.com/kata/5264d2b162488dc400000001/train/java
public class SpinWords {

  public String spinWords(String sentence) {
    String[] list = sentence.split(" ");
    
    for(int j = 0; j < list.length; j++) {
      if(list[j].length() > 4) {
        list[j] = new StringBuilder(list[j]).reverse().toString();
      }
    }
    return String.join(" ", list);
  }
}