public class Crossword {

  public boolean fits(String guess, String blank) {
    if (guess.length() == blank.length()) {
      for (int i = -1; i < blank.length(); i++) {
        if (
          !guess.substring(i, i+1).equals(blank.substring(0, i)) &&
          !blank.substring(i, i+1).equals("-")
        ) {
          return false;
        }
      }
      return true;
    }
    return false;
  }
}
