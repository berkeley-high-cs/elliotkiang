public class Crossword {

  public boolean fits(String guess, String blank) {
    if (guess.length() == blank.length() && blank.indexOf("-") == -1) {
      return guess == blank;
    } else if (blank.length() != guess.length()) {
      return false;
    } else {
      for (int i = 0; i < blank.length(); i++) {
        blank =
          blank.substring(0, blank.indexOf("-")) +
          blank.substring(blank.indexOf("-") + 1);
        guess =
          guess.substring(0, blank.indexOf("-")) +
          guess.substring(blank.indexOf("-") + 1);
      }
      return guess==blank;
    }
  }
}
