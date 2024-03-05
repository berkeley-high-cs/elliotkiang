import java.util.*;

public class Solver {
  public boolean inBounds(int row, int col, String[][] array){
    return row < array.size() && col < array[row].size;
  }
}
