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
      newWord = word.substring(i - 1, i) + newWord;
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

  public boolean isSorted(String[] words) {
    for (int i = 0; i < words.length; i++) {
      if (i + 1 == words.length) {
        return true;
      }
      if (words[i].compareTo(words[i + 1]) > 0) {
        return false;
      }
    }
    return true;
  }
  public ArrayList<Strings> allSubstrings(String base){
    ArrayList<Strings> substrings = new ArrayList<Strings>;
    for(int i = 0; i < base.length(); i++){
      for(int r = i; r < base.length(); r++){
        return substrings;
      }
    }
  }
  public boolean isDigit(String character) {
    for (int i = 0; i <= 9; i++) {
      if (character.indexOf(i) > -1) {
        return true;
      }
    }
    return false;
  }
}
