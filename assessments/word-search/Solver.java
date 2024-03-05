import java.util.*;

public class Solver {
  public boolean inBounds(int row, int col, String[][] array){
    return row < array.length && col < array[row].length;
  }
}
