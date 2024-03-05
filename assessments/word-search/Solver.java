import java.util.*;

public class Solver {

  public boolean inBounds(int row, int col, String[][] array) {
    return (
      (row < array.length && row >= 0) && (col < array[row].length && col >= 0)
    );
  }

  public boolean inGrid(String word, String[][] array) {
    String lettersFound = "";
    String targetLetter = word.substring(0, 1);
    int rowCoord = 0;
    int colCoord = 0;
    while (!lettersFound.equals(word)) {
      if (array[rowCoord][colCoord].equals(targetLetter)) {
        lettersFound += targetLetter;
      } else {
        for (int r = 1; r > -2; r--) {
          for (int c = 0; c < 3; c++) {
            if (
              inBounds(rowCoord + r, i + colCoord, array) &&
              array[i + rowCoord][i + colCoord].equals(targetLetter)
            ) {
              return true;
            }
          }
        }
      }
    }
  }
}
