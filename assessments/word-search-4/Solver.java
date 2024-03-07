import java.util.*;

public class Solver {
public boolean inBounds(int row, int col, String[][] array) {
    return (
      (row < array.length && row >= 0) && (col < array[row].length && col >= 0)
    );
  }
  public boolean atAndInDirection(String word, String[][] grid, int row, int col, int rowChange, int columnChange){
    for(int i = 0; i < word.length(); i++){
      if((grid[row+rowChange][col+columnChange]).equals(word.substring(i,i+1))){
        return true;
      }
    }
    return false;
  } 
  public boolean startingAt(String word, String[][] grid, int row, int col){
    for(int r = 1; r > -2; r--){
      for(int c = -1; c < 2; c++){
        if(atAndInDirection(word, grid, row, col, r, c)){
          return true;
        }
      }
    }
    return false;
  }
  public boolean inGrid(String word, String[][] puzzle){
    for(int r = 0; r < puzzle.length; r++){
      for(int c = 0; c < puzzle[r].length; c++){
        if(startingAt(word, puzzle, r, c)){
          return true;
        }
      }
    }
    return false;
  }
}
