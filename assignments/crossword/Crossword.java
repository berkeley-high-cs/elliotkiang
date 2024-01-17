public class Crossword {

  public boolean fits(String guess, String blank) {
    if (guess.length() == blank.length()) {
      for (int i = 0; i < blank.length(); i++) {
        if (
          !guess.substring(i, i + 1).equals(blank.substring(i, i + 1)) &&
          !blank.substring(i, i + 1).equals("-")
        ) {
          return false;
        }
      }
      return true;
    }
    return false;
  }
}
