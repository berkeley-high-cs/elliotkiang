import java.util.*;

public class Solver extends Helper2 {
  public boolean inBounds(int row, int col, String[][] array) {
    return (
      (row < array.length && row >= 0) && (col < array[row].length && col >= 0)
    );
  }
  public boolean inGrid(String word, String puzzle){
    for(int r = 0; i < puzzle.length; i++){
      for(int c = 0; c < puzzle[r].length; i++){
        if(startingAt(word, puzzle, r, c)){
          return true;
        }
      }
    }
    return false;
  }
}
