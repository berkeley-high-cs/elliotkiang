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
    for (int i = 0; i < word.length(); i++) {
      checkAdjacent()
      if(i+2 >= word.length()){
      targetLetter = word.substring(i+1, i+2);
      } else {
      targetLetter = word.substring(i+1, i+2);
      }
    }
    return letters.equals(word);
  }
  public int[] checkAdjacent(int row, int col, String letter, String[][] array){
    int pos = new int[2];
    for (int r = 1; r > -2; r--) {
        for (int c = -1; c < 2; c++) {
          if (
            inBounds(row + r, col + c, array) &&
            array[row + r][col + c].equals(letter) &&
            !(r == 0 && c == 0)
          ) {
            pos[1] = r;
            pos[2] = c;
            return pos
          }
        }
      }
  }
}
