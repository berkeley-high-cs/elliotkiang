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
    while (word.length() != letters.length && coordinateRow < array.length) {
      if (checkAdjacent()) {
        for (int r = 1; r > -2; r--) {
          for (int c = -1; c < 2; c++) {
            if (
              array[coordinateRow + r][coordinateCol + c].equals(targetLetter)
            ) {
              coordinateRow = r;
              coordinateCol = c;
              letters = letters + targetLetter;
            }
          }
        }
      } else {
        coordinateCol++;
        if(coordinateCol++>=array[coordinateRow].length){
          coordinateCol = 0;
          coordinateRow++;
        }
      }
    }
    return letters.equals(word);
  }

  public boolean checkAdjacent(
    int row,
    int col,
    String letter,
    String[][] array
  ) {
    for (int r = 1; r > -2; r--) {
      for (int c = -1; c < 2; c++) {
        if (
          inBounds(row + r, col + c, array) &&
          array[row + r][col + c].equals(letter)
        ) {
          return true;
        }
      }
    }
    return false;
  }
}
