import java.util.*;

public class Solver {

  public boolean inBounds(int row, int col, String[][] array) {
    return (
      (row < array.length && row >= 0) && (col < array[row].length && col >= 0)
    );
  }

  public boolean inGrid(String word, String[][] array) {
    String targetLetter = word.substring(0, 1);
    for (int i = 0; i < word.length(); i++) {
      for (int r = 1; r > -2; r--) {
        for (int c = -1; c < 2; c++) {
          if (
            inBounds(i + r, i + c, array) &&
            array[i + r][i + c].equals(targetLetter) &&
            (r != 0 && c != 0)
          ) {
            return true;
          }
        }
      }
    }
    return false;
  }
}
