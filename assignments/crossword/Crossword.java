public class Crossword {

  public boolean fits(String guess, String blank) {
    if (guess.length() == blank.length()) {
      for (int i = 0; i < blank.length(); i++) {
        if (
          guess.substring(0, i) != blank.substring(0, i) ||
          blank.substring(0, i) != "-"
        ) {
          return false;
        }
      }
      return true;
    }
    return false;
  }
}
