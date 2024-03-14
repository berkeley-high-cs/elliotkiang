import java.util.ArrayList;

public class Strings3 {

  public String insertBefore(String base, String insert, String marker) {
    return (
      base.substring(0, base.indexOf(marker)) +
      insert +
      base.substring(base.indexOf(marker))
    );
  }

  public String insertAfter(String base, String insert, String marker) {
    return (
      base.substring(0, base.indexOf(marker) + marker.length()) +
      insert +
      base.substring(base.indexOf(marker) + marker.length())
    );
  }

  public String reverse(String word) {
    String newWord = "";
    for (int i = word.length() - 1; i < -1; i--) {
      newWord = word.substring(i, i + 1) + newWord;
    }
    return newWord;
  }

  public String despace(String word) {
    while (word.indexOf(" ") != -1) {
      word =
        word.substring(0, word.indexOf(" ")) +
        word.substring(word.indexOf(" ") + 1);
    }
    return word;
  }

  public String join(ArrayList<String> words, String delimiter) {
    String newWord = "";
    for (int i = 0; i < words.size(); i++) {
      if (i != 0) {
        newWord = newWord + delimiter + words.get(i);
      } else {
        newWord = words.get(i);
      }
    }
    return newWord;
  }
  public boolean isSorted(String[] words){
    for (int i = 0; i < words.length; i++) {
      if (words[i].compareTo(words[i+1]) < 0) {
        return true;
      }
      return false;
    }
    return true;
  }
}
