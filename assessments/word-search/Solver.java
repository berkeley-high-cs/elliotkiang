import java.util.*;

public class Solver {

  public boolean inBounds(int row, int col, String[][] array) {
    return (
      (row < array.length && row >= 0) && (col < array[row].length && col >= 0)
    );
  }

  public boolean inGrid(String word, String[][] array) {
    String letters = "";
    String targetLetter = word.substring(0, 1);
    int coordinateRow = 0;
    int coordinateCol = 0;
    for (int i = 0; i < word.length(); i++) {
      for (int r = 1; r > -2; r--) {
        for (int c = -1; c < 2; c++) {
          if (
            inBounds(coordinateRow + r, coordinateCol + c, array) &&
            array[coordinateRow + r][coordinateCol + c].equals(targetLetter) &&
            !(r == 0 && c == 0)
          ) {
            coordinateRow = r;
            coordinateCol = c;
            letters = letters + targetLetter;
          }
        }
      }
      if(i+2 < word.length()){
      targetLetter = word.substring(i+1, i+2);
      } else {
      targetLetter = word.substring(i+1);
      }
    }
    return letters.equals(word);
  }
}
